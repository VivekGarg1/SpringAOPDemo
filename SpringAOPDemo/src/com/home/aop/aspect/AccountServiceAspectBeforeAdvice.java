package com.home.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class AccountServiceAspectBeforeAdvice {

	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
	}
}
