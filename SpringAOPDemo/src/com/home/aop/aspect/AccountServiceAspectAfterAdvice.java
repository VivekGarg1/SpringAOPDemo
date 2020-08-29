package com.home.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class AccountServiceAspectAfterAdvice {

	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
	}
}
