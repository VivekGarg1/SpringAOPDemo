package com.home.aop.aspect;

import org.aspectj.lang.JoinPoint;

import com.home.model.Account;

public class AccountServiceAspectAfterReturnAndThrowingAdvice {

	public void afterReturningAdvice(JoinPoint joinPoint,Account account) {
		System.out.println("After Return Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println(account);
	}
	
	public void afterThrowingAdvice(JoinPoint joinPoint,Exception e) {
		System.out.println("After Throwing Exception in Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Exception is: "+e.getMessage());
	}
}
