package com.home.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountServiceAroundAdvice {
	
	@Around(value = "execution(* com.home.service.impl.AccountServiceImpl.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
		System.out.println("Before Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		Long startTime=System.currentTimeMillis();
		Object object=null;
		try {
			object=joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("Exception is: "+e.getMessage());
		}
		System.out.println("After Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		Long endTime=System.currentTimeMillis();
		
		System.out.println("Total Execution time taken by Method: "+joinPoint.getSignature().getName()+" is "+(endTime-startTime)+" inMillisec.");
		return object;
	}
}
