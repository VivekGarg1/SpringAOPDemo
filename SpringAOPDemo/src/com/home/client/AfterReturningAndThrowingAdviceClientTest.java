package com.home.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Account;
import com.home.service.AccountService;
import com.home.service.impl.AccountServiceImpl;

public class AfterReturningAndThrowingAdviceClientTest {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("AfterReturningAndThrowingAdviceBeans.xml");
		AccountService accountServiceImpl = context.getBean("accountService", AccountServiceImpl.class);
		//After-return advice
		//Account account = accountServiceImpl.getAccountBycustomerId("CU3456789");
		//After-throw advice
		Account account = accountServiceImpl.getAccountBycustomerId(null);
		if(account != null)
			System.out.println(account.getAccountNumber()+"\t"+account.getAccountDescription());
		((AbstractApplicationContext) context).close();
	}

}
