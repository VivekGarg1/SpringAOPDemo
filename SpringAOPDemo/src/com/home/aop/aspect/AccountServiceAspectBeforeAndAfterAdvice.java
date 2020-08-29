package com.home.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class AccountServiceAspectBeforeAndAfterAdvice {
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
	}

	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
	}
}
