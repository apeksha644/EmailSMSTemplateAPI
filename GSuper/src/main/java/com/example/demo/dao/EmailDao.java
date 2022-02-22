package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmailS;


@Repository
public class EmailDao {
	
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	
	public List<EmailS> GetEmailSmsTemplate(String input)
	{
		return em.createNamedStoredProcedureQuery("AllEmailDetails").setParameter("CommunicationType", input).getResultList();
	}

}
