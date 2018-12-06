package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAdvice {
	
@AfterReturning(value = "getPtCut()")
	public void logMsg(JoinPoint jp) {
       jp.getTarget();
		System.out.println("Inside logging advice "+jp.getTarget());
	}
@AfterReturning(value = "@annotation(com.example.demo.annotation.Loggable)")
public void customNsg(JoinPoint jp) {
   jp.getTarget();
	System.out.println("##Custom##Inside logging advice "+jp.getTarget());
}
/*@Before("args(name)")
public void logargs(String name) {

	System.out.println("Inside logging advice "+name);
}*/
@Around(value = "getPtCut()")
public void aroundAdv(ProceedingJoinPoint jp) {
	System.out.println("##Around##: Before method run around advice");
   try {
	jp.proceed();
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	System.out.println("##Around##:  After around logging advice "+jp.getTarget());
}
@Pointcut("within(com.example.demo..*)")
public void getPtCut() {
}

}
