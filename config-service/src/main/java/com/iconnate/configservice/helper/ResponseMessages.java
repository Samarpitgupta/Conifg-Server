package com.iconnate.configservice.helper;

/**
 * @author samar
 *
 */
public class ResponseMessages {

	private ResponseMessages() {
	}

	static final String UNAVAILABLE = "UNAVAILABLE";
	static final String INVALID = "INVALID";
	static final String ALREADY_EXISITS = "ALREADYEXISTS";
	static final String INTERNAL_ERROR = "INTERNALERROR";

	public static class ErrorMessages {
		private ErrorMessages() {
		}

		static final Integer CUSTOM_ERROR_ID = 9999;
		static final String REQUIRED_FIELDS_MISSING = "Required fields are missing. Please add and try again";
	}


}
