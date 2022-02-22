package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmailResponse;
import com.example.demo.entity.EmailS;

public interface EmailRepo  extends JpaRepository<EmailS, Integer>{

	public EmailResponse getEmailResponse(String communicationType);

}
