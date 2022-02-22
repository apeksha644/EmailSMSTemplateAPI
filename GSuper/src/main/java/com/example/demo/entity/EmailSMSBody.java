package com.example.demo.entity;

public class EmailSMSBody {
	
	private String communicationType;

	public EmailSMSBody(String communicationType) {
		super();
		this.communicationType = communicationType;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}

	@Override
	public String toString() {
		return "EmailSMSBody [communicationType=" + communicationType + "]";
	}
	
	

}
