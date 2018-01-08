package com.zd.spring.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;



/**
//前置通知：目标方法运行之前调用
//后置通知(如果出现异常不会调用)：在目标方法运行之后调用
//环绕通知：在目标方法之前和之后都调用
//异常拦截通知：如果出现异常，就会调用
//后置通知(无论是否出现 异常都会调用)：在目标方法运行之后调用
*/
@Aspect
public class MyAdvice2 {
	@Pointcut("execution(* com.zd.spring.service.impl.*.*(..))")
	public void pc(){}
	
	@Before("MyAdvice2.pc()")
	public void Before(){
		System.out.println("========前置通知========");
	}
	
	@AfterThrowing("MyAdvice2.pc()")
	public void AfterThrowing(){
		System.out.println("========异常通知========");
	}
	
	@AfterReturning("MyAdvice2.pc()")
	public void afterReturning(){
		System.out.println("========后置通知========");
	}
}
