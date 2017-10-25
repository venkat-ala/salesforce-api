package com.revature.revpro.salesforceapi.utils;

public final class ServiceConstants {

  public static final String AUTHENTICATION_SUCCESS_CODE = "SC001";
  public static final String AUTHENTICATION_SUCCESS_MESSAGE = "Authentication Success";
  public static final String AUTHENTICATION_FAILED_CODE = "SC002";
  public static final String AUTHENTICATION_FAILED_MESSAGE = "Authentication Failed";
  public static final String DATA_INSERTION_SUCCESS_CODE = "SC003";
  public static final String DATA_INSERTION_SUCCESS_MESSAGE = "Data Insertion Success";
  public static final String DATA_INSERTION_FAILED_CODE = "SC004";
  public static final String DATA_INSERTION_FAILED_MESSAGE = "Data Insertion Failed";
  public static final String DATA_INSERTION_DUPLICATION_CODE = "SC0041";
  public static final String DATA_INSERTION_DUPLICATION_MESSAGE = "Data Has Already Been Inserted";
  public static final String DATA_RETRIEVAL_SUCCESS_CODE = "SC005";
  public static final String DATA_RETRIEVAL_SUCCESS_MESSAGE = "Data Retrieval Success";
  public static final String DATA_RETRIEVAL_FAILED_CODE = "SC006";
  public static final String DATA_RETRIEVAL_FAILED_MESSAGE = "Data Retrieval Failed";
  public static final String DATA_UPDATE_SUCCESS_CODE = "SC007";
  public static final String DATA_UPDATE_SUCCESS_MESSAGE = "Data Update Success";
  public static final String DATA_UPDATE_FAILED_CODE = "SC008";
  public static final String DATA_UPDATE_FAILED_MESSAGE = "Data Update Failed";
  public static final String DATA_DELETION_SUCCESS_CODE = "SC009";
  public static final String DATA_DELETION_SUCCESS_MESSAGE = "Data Deletion Success";
  public static final String DATA_DELETION_FAILED_CODE = "SC010";
  public static final String DATA_DELETION_FAILED_MESSAGE = "Data Deletion Failed";
  public static final String SYSTEM_ERROR_CODE = "SC028";
  public static final String SYSTEM_ERROR_MESSAGE = "System Error";
  public static final String INVALID_INPUT_ERROR_CODE = "SC024";
  public static final String INVALID_INPUT_ERROR_MESSAGE = "Invalid Input";
  public static final String NO_RECORDS_FOUND_ERROR_CODE = "SC026";
  public static final String NO_RECORDS_FOUND_ERROR_MESSAGE = "No records found";
  public static final String IN_ACTIVE_ACCOUNT_CODE = "SC030";
  public static final String IN_ACTIVE_ACCOUNT_MESSAGE = "Inactive User account";
  public static final String EMAIL_SEND_SUCCESS_CODE = "SC011";
  public static final String EMAIL_SEND_SUCCESS_MESSAGE = "Email Send Success";
  public static final String EMAIL_SEND_FAILED_CODE = "SC012";
  public static final String EMAIL_SEND_FAILED_MESSAGE = "Email Send Failed";
  public static final String TOKEN_GENERATE_SUCCESS_CODE = "SC013";
  public static final String TOKEN_GENERATE_SUCCESS_MESSAGE = "Token Generate Success";
  public static final String TOKEN_GENERATE_FAILED_CODE = "SC014";
  public static final String TOKEN_GENERATE_FAILED_MESSAGE = "Token Generate Fail";
  public static final String UNAUTHORIZED_CODE = "EC401";
  public static final String UNAUTHORIZED_MESSAGE = "Unauthorized; Access Denied.";
  public static final String SOCIAL_ALREADY_EXISTS_CODE = "SN001";
  public static final String SOCIAL_ALREADY_EXISTS_MESSAGE = "Social Account already registered";
  public static final String FRIEND_DOES_NOT_EXISTS_CODE = "IF001";
  public static final String FRIEND_DOES_NOT_EXISTS_MESSAGE = "User not found";
  public static final String FRIEND_ADDED_SUCCESS_CODE = "IF002";
  public static final String FRIEND_ADDED_SUCCESS_MESSAGE = "Friend Added Successfully";
  public static final String FRIEND_REQUEST_SENT_SUCCESS_CODE = "IF003";
  public static final String FRIEND_REQUEST_SENT_SUCCESS_MESSAGE =
      "Friend Request Sent Successfully";
  public static final String FRIEND_REQUEST_SENT_ALREADY_CODE = "IF004";
  public static final String FRIEND_REQUEST_SENT_ALREADY_MESSAGE = "Friend Request Sent Already";
  public static final String FRIEND_ALREADY_IN_LIST_CODE = "IF005";
  public static final String FRIEND_ALREADY_IN_LIST_MESSAGE = "Friend Already In List";
  public static final String USER_INVITED_SUCCESS_CODE = "IF006";
  public static final String USER_INVITED_SUCCESS_MESSAGE = "User Invited Successfully";
  public static final String USER_ALREADY_INVITED_CODE = "IF007";
  public static final String USER_ALREADY_INVITED_MESSAGE = "User Has Been Already Invited";
  public static final String NO_ACCESS_ERROR_CODE = "NA001";
  public static final String NO_ACCESS_MESSAGE = "You don't have access to start this assesment";
  public static final String ALREADY_SUBMITTED_ERROR_CODE = "AS001";
  public static final String NO_MORE_ATTEMPT_ERROR_CODE = "NT001";
  public static final String ANSWER_VIEWED_ERROR_CODE = "AV001";
  public static final String PORTFOLIO_WORD_DOWNLOAD_SUCCESS_CODE = "PW001";
  public static final String PORTFOLIO_WORD_DOWNLOAD_SUCCESS_MESSAGE =
      "Portfolio word doc downloaded successfully";
  public static final String PORTFOLIO_WORD_DOWNLOAD_FAILURE_CODE = "PW002";
  public static final String PORTFOLIO_WORD_DOWNLOAD_FAILURE_MESSAGE =
      "Portfolio word doc download failed";
  public static final String SESSION_EXPIRED_CODE = "SE001";
  public static final String SESSION_EXPIRED_MESSAGE =
      "You deactivated your session from another device. Please login again.";
  public static final String UNAUTHORIZED_LOGIN_MESSAGE =
      "You'll need to login again to access this resource.";
  public static final String ACTIVATE_ACCOUNT =
      "Your account needs to be activated. Request an account activation email using the <a href='/forgot-password'>Forgot Password</a> link";
  public static final String DISABLE_ACCOUNT =
      "Your account is disabled. Please contact support@revature.com";
  public static final String TIMEZONE_POPULATE_SUCCESS_MESSAGE =
      "All timezones are populated successfully";
  public static final String NOT_SIGNEDUP = "You have not signed up using your social account";
  public static final String ALREADY_SIGNEDUP =
      "You have already signed up using your social account.Please login";
  public static final String ACCOUNT_CREATION_FAILED =
      "Your account creation failed.Please try again.";
  public static final String NO_ACCESS_ERROR_CODE_FOR_STAGED_USER = "SU001";
  public static final String NO_ACCESS_ERROR_MESSAGE_FOR_STAGED_USER =
      "User has to enter Activation Code for future verification.";
  public static final String COUPON_ERROR_CODE = "CEC01";
  public static final String COUPON_ERROR_MESSAGE = "Activation Code are not valid.";
  public static final String NO_ACCESS_AFTER_ACC_ACTIVATION_CODE = "SU002";
  public static final String NO_ACCESS_AFTER_ACC_ACTIVATION_MESSAGE =
      "Upload organization related document for future verification.";
  public static final String DISABLE_ORGANIZATION =
      "Opps, Something went wrong. Please contact support@revature.com";
  public static final String UNIQUE_CONTACT_ERROR =
      "Your mobile number already exists. Please use another one.";

  public static final String USER_TRANSFER_CODE = "UT001";
  public static final String USER_TRANSFER_MESSAGE = "You'll need to login to your account again.";

  public static final String SCHEDULER_TRIGGER_SUCCESS = "SCH001";
  public static final String SCHEDULER_TRIGGER_FAILED = "SCH002";

  ServiceConstants() {
    // Default constructor
  }
}
