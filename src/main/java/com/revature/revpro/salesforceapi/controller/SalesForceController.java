package com.revature.revpro.salesforceapi.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.revpro.salesforceapi.biz.SalesforceService;
import com.revature.revpro.salesforceapi.utils.ServiceConstants;
import com.revature.revpro.salesforceapi.utils.ServiceResponseUtils;
import com.revature.revpro.salesforceapi.vo.HttpStatusResponse;
import com.revature.revpro.salesforceapi.vo.Intern;

@RestController
@RequestMapping("/salesforce/")
public class SalesForceController {
  private static Logger log = Logger.getLogger(SalesForceController.class);
  
  @Autowired
  private SalesforceService salesforceservice;

 @PostMapping(value ="update")
  public ResponseEntity<HttpStatusResponse> updateSFDetails(@RequestBody Intern intern) {
    HttpStatusResponse response = new HttpStatusResponse();
   // Intern intern = new Intern();
    try {    	
    	salesforceservice.doGetUpdate(intern);
      response.setStatusCode(HttpStatus.OK.value());
      response.setDescription("SF updated successfully.");
      return new ResponseEntity<>(response, HttpStatus.OK);
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      return new ResponseEntity<>(
          ServiceResponseUtils.setHttpResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
              ServiceConstants.DATA_UPDATE_FAILED_MESSAGE, null),
          HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
