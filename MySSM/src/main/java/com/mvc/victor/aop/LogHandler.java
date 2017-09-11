package com.mvc.victor.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogHandler {
	
	//execution(* com.mvc.victor.service..*.*(..))
	@Pointcut("execution(* com.mvc.victor.service.*.do*(..))")
	public void aspect(){}
	
	@Before("aspect()")
	public void before(JoinPoint jp){
		String name = jp.getSignature().getName();
		Object[] o = jp.getArgs();
		System.out.println("before------------"+name+"");
	}
	
	@Around("execution(* com.mvc.victor.service.*.get*(..))")
	public Object around(ProceedingJoinPoint pjp){
		System.out.println("around:before------------");
		String o = null;
		try {
			//Object args[] = {"2"};
			Object args[] = pjp.getArgs();
			o = (String)pjp.proceed(args);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("origin value:"+o);
		System.out.println("around:after------------");
		o="replace";
		return o;
	}
	
}
