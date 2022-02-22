package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmailDao;
import com.example.demo.entity.EmailResponse;
import com.example.demo.entity.EmailS;
import com.example.demo.entity.EmailSMSBody;
import com.example.demo.repository.EmailRepo;

@RestController
public class EmailController {

	
//	@Autowired
//	private EmailDao emailDao;
	
	@Autowired
	private EmailRepo empRepo;
	
//	@GetMapping("/emaillist/{CommunicationType}")
//	public List<EmailS> GetEmailSmsTemplate(@PathVariable String CommunicationType)
//	{
//		return emailDao.GetEmailSmsTemplate(CommunicationType);
//		
//	}
//	
	@PostMapping(path = "/GetEmailSmsTemplate",consumes = {MediaType.APPLICATION_JSON_VALUE,
			                           MediaType.APPLICATION_XML_VALUE})
	
	public EmailResponse GetEmailSmsTemplate(@RequestHeader String header,@RequestBody EmailSMSBody Esmsbody)
	{
		EmailResponse emresponse = this.empRepo.getEmailResponse(Esmsbody.getCommunicationType());
		System.out.println(emresponse.toString());
		return emresponse;
	}
}
