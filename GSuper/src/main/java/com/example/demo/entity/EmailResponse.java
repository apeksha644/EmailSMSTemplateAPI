package com.example.demo.entity;

import java.util.List;

public class EmailResponse {

	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private List<EmailS> OfferList;

	public EmailResponse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param status
	 * @param errorCode
	 * @param messageType
	 * @param message
	 * @param offerList
	 */
	public EmailResponse(int status, int errorCode, String messageType, String message, List<EmailS> offerList) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		OfferList = offerList;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public int getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}

	public String getMessageType() {
		return MessageType;
	}

	public void setMessageType(String messageType) {
		MessageType = messageType;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public List<EmailS> getOfferList() {
		return OfferList;
	}

	public void setOfferList(List<EmailS> emailList) {
		emailList = emailList;
	}
}
