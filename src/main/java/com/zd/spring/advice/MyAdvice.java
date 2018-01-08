package com.zd.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
//前置通知：目标方法运行之前调用
//后置通知(如果出现异常不会调用)：在目标方法运行之后调用
//环绕通知：在目标方法之前和之后都调用
//异常拦截通知：如果出现异常，就会调用
//后置通知(无论是否出现 异常都会调用)：在目标方法运行之后调用
*/
public class MyAdvice {
	//前置通知
	public void before(){
		System.out.println("==========前置通知==========");
	}
	
	public void afterReturning(){
		System.out.println("==========后置通知==========");
	}
	
	public void afterException(){
		System.out.println("==========异常通知==========");
	}
	
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("==========环绕之前==========");
		Object object = point.proceed();
		System.out.println("==========环绕之后==========");
		return object;
	}
	
	public void after(){
		System.out.println("==========finally通知==========");
	}
}
