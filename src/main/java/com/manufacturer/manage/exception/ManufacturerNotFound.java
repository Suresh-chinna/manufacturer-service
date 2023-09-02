package com.manufacturer.manage.exception;

public class ManufacturerNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ManufacturerNotFound(String message) {
		super(message);

		/*
		 * @Override public HttpHeaders getResponseHeaders() { // return response
		 * headers }
		 */
	}
}
