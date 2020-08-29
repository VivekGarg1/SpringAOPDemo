package com.home.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PonitCutDefinition {

	@Pointcut("within(com.home.web..*)")
	public void webLayer() {

	}

	@Pointcut("within(com.home.service..*)")
	public void serviceLayer() {

	}

	@Pointcut("within(com.home.dao..*)")
	public void dataAccessLayer() {

	}
}
