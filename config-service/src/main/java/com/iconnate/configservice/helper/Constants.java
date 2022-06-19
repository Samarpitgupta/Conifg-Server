package com.iconnate.configservice.helper;

/**
 * @author samar
 *
 */
public class Constants {

	private Constants() {
	}

	public static final String SLASH="/";

	/**
	 * Query Parameters and Response Parameters
	 */
	public static final String SUCCESS = "success";
	/**
	 * Status Code and Messages
	 */
	public static final int UNAUTHORIZED_ID = 401;
	public static final int SUCCESS_ID = 200;
	public static final int FAILURE_ID = 320;
	public static final String UNAUTHORIZED = "Invalid credentials. Please try again.";
	public static final String PROCESS_FAIL = "Process failed, Please try again.";

	/**
	 * Allowed Origins for CORS Bean
	 */
	public static final String GET = "GET";
	public static final String POST = "POST";
	public static final String PUT = "PUT";
	public static final String DELETE = "DELETE";
	public static final String OPTIONS = "OPTIONS";
}
