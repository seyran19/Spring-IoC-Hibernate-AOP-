package Repeat.AOP.AfterThrowing.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAdvice {

    @AfterThrowing(pointcut = "execution(* GetSomeAge())", throwing="exception")
    public void afterThrowing(JoinPoint jp, Throwable exception){
        System.out.println("There is your exception "+ exception);

    }
}
