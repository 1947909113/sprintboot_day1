package com.baizhi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class Aroud {

    //切入点
    @Pointcut("@annotation(Log)")
    public void pointCut(){

    }
    @Around(value = "pointCut()")
    public Object AroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed=null;
        try {
            //放行
            proceed = proceedingJoinPoint.proceed();
            System.out.println("method is finish");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }

}
