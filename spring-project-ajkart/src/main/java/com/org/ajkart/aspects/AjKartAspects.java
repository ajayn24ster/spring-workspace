package com.org.ajkart.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.org.ajkart.util.DBSessionUtil;

@Aspect
@Component
public class AjKartAspects {
	@Around(value = "@annotation(com.org.ajkart.annotations.AjKartLogging)")
	public void aroundLoggingAdvice(ProceedingJoinPoint jp) {
		System.out.println("Before Entering controller method");
		try {
			String retVal = (String) jp.proceed();
			System.out.println("Before Entering controller method : " + retVal);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Around(value = "@annotation(com.org.ajkart.annotations.TransactionAspect)")
	public void aroundTransactionAdvice(ProceedingJoinPoint jp) {
		System.out.println("Transaction started");
		try {
			SessionFactory sf = DBSessionUtil.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			String retVal = (String) jp.proceed();
			System.out.println("Before Entering controller method : " + retVal);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
