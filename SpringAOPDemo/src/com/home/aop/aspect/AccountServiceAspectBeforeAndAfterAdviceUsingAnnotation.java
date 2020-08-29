package com.home.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.home.model.Account;

@Aspect
@Component
public class AccountServiceAspectBeforeAndAfterAdviceUsingAnnotation {
	
	
	/*@Before(value = "execution(* com.home.service.impl.AccountServiceImpl.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
	}

	@After(value = "execution(* com.home.service.impl.AccountServiceImpl.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
	}*/
	
	//Use dummy pointcut
		/*@Pointcut(value ="execution(* com.home.service.impl.AccountServiceImpl.*(..))")
		public void selectAll() {
			
		}
		
		@Before(value = "selectAll()")
		public void beforeAdvice(JoinPoint joinPoint) {
			System.out.println("Before Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		}

		@After(value = "selectAll()")
		public void afterAdvice(JoinPoint joinPoint) {
			System.out.println("After Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		}*/
		
		//Use centralized pointcut
				
	   /*@Before(value = "execution(* com.home.service.impl.AccountServiceImpl.*(..)) and args(account,..)")
		public void beforeAdvice(JoinPoint joinPoint,Account account) {
			System.out.println("Before Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		}

		@After(value = "execution(* com.home.service.impl.AccountServiceImpl.*(..))")
		public void afterAdvice(JoinPoint joinPoint) {
			System.out.println("After Method: "+joinPoint.getSignature().getName()+",Class: "+joinPoint.getTarget().getClass().getSimpleName());
		}*/
		
}
