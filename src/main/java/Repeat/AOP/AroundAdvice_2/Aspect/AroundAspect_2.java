package Repeat.AOP.AroundAdvice_2.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect_2 {
    @Around("execution(public String takeOff())")
    public Object carReturningAdvice(ProceedingJoinPoint joinPoint) {

        System.out.println("Начало работы Around: \n");

        Object o = null;
        try {
            o = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        o = "Boing";

        System.out.println("Завершение работы Around");

        return o;

    }
}
