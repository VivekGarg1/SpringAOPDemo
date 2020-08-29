package com.home.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.home.model.Account;

@Aspect
@Component
public class AccountServiceAspectAfterReturnAndThrowingAdviceUsingAnnotation {

	@AfterReturning(value = "execution(* com.home.service.impl.AccountServiceImpl.*(..))", returning = "account")
	public void afterReturningAdvice(JoinPoint joinPoint,Account account) {
		System.out.println("After Return Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println(account);
		
	}
	
	@AfterThrowing(value = "execution(* com.home.service.impl.AccountServiceImpl.*(..))", throwing = "e")
	public void afterThrowingAdvice(JoinPoint joinPoint,Exception e) {
		System.out.println("After Throwing Exception in Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("Exception is: "+e.getMessage());
	}
}
