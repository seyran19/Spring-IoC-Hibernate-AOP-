package Repeat.AOP.AroundAdvice_1.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

    @Around("execution(public String returning())")
    public Object carReturningAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Начало работы Around: \n");

        Object o = joinPoint.proceed();
        o = "Ferrari";

        System.out.println("Завершение работы Around");

        return o;

    }
}
