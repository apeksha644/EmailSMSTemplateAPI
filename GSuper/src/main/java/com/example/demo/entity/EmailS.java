package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "AllEmailDetails", procedureName = "GetEmailSmsTemplate",
parameters = {@StoredProcedureParameter(mode=ParameterMode.IN,name="CommunicationType",type = String.class)})})




public class EmailS {
	
	@Id
	private int id;
	private String SenderEmailID;
	private String SenderName;
	private String Subject;
	private String MessageBody;
	private String MessageType;
	private String CC;
	private String BCC;
	private String Remarks;
	private Date CreatedOnDate;
	private String IsActive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSenderEmailID() {
		return SenderEmailID;
	}
	public void setSenderEmailID(String senderEmailID) {
		SenderEmailID = senderEmailID;
	}
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getMessageBody() {
		return MessageBody;
	}
	public void setMessageBody(String messageBody) {
		MessageBody = messageBody;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getCC() {
		return CC;
	}
	public void setCC(String cC) {
		CC = cC;
	}
	public String getBCC() {
		return BCC;
	}
	public void setBCC(String bCC) {
		BCC = bCC;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public Date getCreatedOnDate() {
		return CreatedOnDate;
	}
	public void setCreatedOnDate(Date createdOnDate) {
		CreatedOnDate = createdOnDate;
	}
	public String getIsActive() {
		return IsActive;
	}
	public void setIsActive(String isActive) {
		IsActive = isActive;
	}
	
	
	
	
	
	
	
	

}
