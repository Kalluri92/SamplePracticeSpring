package com.ourportal.directory;

import java.util.List;

public class Response {

	private boolean success;
	private String responseMessage;
	private List<Object> optionalResponseObject;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public List<Object> getOptionalResponseObject() {
		return optionalResponseObject;
	}
	public void setOptionalResponseObject(List<Object> optionalResponseObject) {
		this.optionalResponseObject = optionalResponseObject;
	}
	public Response(boolean success, String responseMessage, List<Object> optionalResponseObject) {
		this.success = success;
		this.responseMessage = responseMessage;
		this.optionalResponseObject = optionalResponseObject;
	}
	public Response() {
		
	}
}
