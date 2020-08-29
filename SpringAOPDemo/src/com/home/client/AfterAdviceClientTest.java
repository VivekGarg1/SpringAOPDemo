package com.home.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Account;
import com.home.service.AccountService;
import com.home.service.impl.AccountServiceImpl;

public class AfterAdviceClientTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AfterAdviceBeans.xml");
		AccountService accountServiceImpl = context.getBean("accountService", AccountServiceImpl.class);
		accountServiceImpl.updateAccountBalance(new Account("123456789", "Money Transfer"), 1500l);
		((AbstractApplicationContext) context).close();
	}

}
