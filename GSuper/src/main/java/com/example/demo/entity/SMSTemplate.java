package com.example.demo.entity;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;


@Entity
//@Table
//@SqlResultSetMapping(name="SmsTemplate",classes = @ConstructorResult(targetClass = SMSTemplate.class,
//columns = {@ColumnResult(name="Id",type = Integer.class),
//		   @ColumnResult(name="D1TTemplateIDD",type = String.class),
//		   @ColumnResult(name="MessageBody",type = String.class),
//		   @ColumnResult(name="SenderName",type = String.class)}))

public class SMSTemplate {
	
	@Id
	private int Id;
	private String D1TTemplateIDD;
	private String MessageBody;
	private String SenderName;
	public SMSTemplate(int id, String d1tTemplateIDD, String messageBody, String senderName) {
		super();
		Id = id;
		D1TTemplateIDD = d1tTemplateIDD;
		MessageBody = messageBody;
		SenderName = senderName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getD1TTemplateIDD() {
		return D1TTemplateIDD;
	}
	public void setD1TTemplateIDD(String d1tTemplateIDD) {
		D1TTemplateIDD = d1tTemplateIDD;
	}
	public String getMessageBody() {
		return MessageBody;
	}
	public void setMessageBody(String messageBody) {
		MessageBody = messageBody;
	}
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	
	
	

}
