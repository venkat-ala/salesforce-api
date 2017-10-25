package com.revature.revpro.salesforceapi.biz.impl;

import java.util.Date;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.revature.revpro.salesforceapi.biz.SalesforceService;
import com.revature.revpro.salesforceapi.vo.Intern;
import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.SaveResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

@Service
public class SalesforceServiceImpl implements SalesforceService{
	
	
	 private PartnerConnection salesForceConnectorConfig() throws ConnectionException {
		    String sfUserName = "xxxxxxxxxx";
		    String sfPassWord = "xxxxxxxxxxx";
		    String sfPartnerConEndPoint ="https://test.salesforce.com/services/Soap/u/41.0";

		    ConnectorConfig sfconfig = new ConnectorConfig();
		    sfconfig.setUsername(sfUserName);
		    sfconfig.setPassword(sfPassWord);
		    sfconfig.setAuthEndpoint(sfPartnerConEndPoint);
		    PartnerConnection partnercon = Connector.newConnection(sfconfig);
		    return partnercon;
		  }

	 
	 private QueryResult checkContact(Intern intern, PartnerConnection partnerconCheck)
		      throws ConnectionException {
		    QueryResult queryresults = null;
		    if (intern.getEmail() != null) {
		      queryresults = partnerconCheck.query(
		          "Select Id,FirstName,LastName from Contact where Email='" + intern.getEmail() + "'");
		    }
		    if ((queryresults == null || queryresults.getSize() == 0) && intern.getSalesForceId() != null) {
		      queryresults = partnerconCheck.query(
		          "Select Id,FirstName,LastName from Contact where id='" + intern.getSalesForceId() + "'");
		    }

		    return queryresults;
		  }
	 
	private static final String CANDIDATE_TYPE = "Training";
	 
	@Override
	public void doGetUpdate(Intern intern) {

		boolean objectOnly = false;
	    SObject contact = null;
	    Boolean create = false;
	    String salesForceId = "";
	    Date signedUpDate = new Date();

	    try {
	      PartnerConnection partnerconCheck = salesForceConnectorConfig();
	      QueryResult queryresults = checkContact(intern, partnerconCheck);

	      SObject[] objects = queryresults.getRecords();
	      if (objects.length != 0) {
	        salesForceId = objects[0].getId();
	      }


	      if (queryresults.getSize() == 0) {
	        create = true;
	      }
	      //if (create == true) {
	        contact = new SObject();
	        contact.setType("Contact");
	       // contact.set
	        contact.setName(new QName("Revature"));
	        if (intern.getCandidateType() != null
	            && intern.getCandidateType().equalsIgnoreCase(CANDIDATE_TYPE)) {
	          contact.setField("Candidate_Type__c", CANDIDATE_TYPE);
	          contact.setField("rnm__Source__c", "Apply Now Page");

	        } else {
	          contact.setField("Candidate_Type__c", "eintern");
	          contact.setField("rnm__Source__c", "eIntern Sign Up");
	        }

	        String fullName = intern.getFullName();
	        if (fullName != null) {
	          String[] split = fullName.split("\\s+");
	          String firstName = split[0];
	          String lastName = null;
	          int index = fullName.indexOf(" ");
	          if (index != -1) {
	            lastName = fullName.substring(index, fullName.length()).trim();
	          }
	          if (firstName != null) {
	            contact.setField("FirstName", firstName);
	          }
	          if (lastName != null) {
	            contact.setField("LastName", lastName);
	          } else {
	            contact.setField("LastName", fullName);
	          }

	        }
	        if (intern.getContactNo() != null && !intern.getContactNo().isEmpty()) {
	          contact.setField("MobilePhone", intern.getContactNo());
	        }
	        contact.setField("Email", intern.getEmail());

	        if (intern.getEmail() != null) {
	          contact.setField("eInternSystemUserName__c", intern.getEmail());
	        }

	        if (signedUpDate != null) {
	          contact.setField("eIntern_RegisteredDate__c",signedUpDate);
	        }

	        if (intern.getIsActive()) {
	          contact.setField("eIntern_SignUpStatus__c", "Y");
	        } else {
	          contact.setField("eIntern_SignUpStatus__c", "N");
	        }

	      //  internDetails(intern, contact, partnerconCheck);
	        contact.setField("eInternSystemId__c", intern.getId().toString());
	        if (!objectOnly) {
	          SaveResult[] sfcontactresults = partnerconCheck.create(new SObject[] {contact});
	          System.out.println("sfcontactresults[0].getId() ::"+sfcontactresults[0].getId());
	         /* if (sfcontactresults[0].getId() != null) {
	            this.internDAO.updateInternSalesforceDetails(intern.getId(),
	                sfcontactresults[0].getId());
	          }*/
	        }
	    //  } 
	    }  catch (Exception e) {
	      e.printStackTrace();
	    }
	  
		
	}

}
