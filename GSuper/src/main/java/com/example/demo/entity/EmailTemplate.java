package com.example.demo.entity;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;


//@Table
//@SqlResultSetMapping(name="EmailTemplate",classes = @ConstructorResult(targetClass = EmailTemplate.class,
//columns = {@ColumnResult(name="Id",type = Integer.class),
//		 @ColumnResult(name="SenderEmailID",type = String.class),
//		 @ColumnResult(name="SenderName",type = String.class),
//		 @ColumnResult(name="Subject",type = String.class),
//		   @ColumnResult(name="BCC",type = String.class),
//		   @ColumnResult(name="CC",type = String.class),
//		  }))


@Entity
public class EmailTemplate {
	
	@Id
	private int Id;
	private String SenderEmailID;
	private String SenderName;
	private String Subject;
	private String BCC;
	private String CC;
	public EmailTemplate(int id, String senderEmailID, String senderName, String subject, String bCC, String cC) {
		super();
		Id = id;
		SenderEmailID = senderEmailID;
		SenderName = senderName;
		Subject = subject;
		BCC = bCC;
		CC = cC;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getBCC() {
		return BCC;
	}
	public void setBCC(String bCC) {
		BCC = bCC;
	}
	public String getCC() {
		return CC;
	}
	public void setCC(String cC) {
		CC = cC;
	}
	
	

}
