package Repeat.AOP.After.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAdvice {

    @After("execution(* getSomeAge())")
    public void afterThrowing(JoinPoint jp){
        System.out.println("I cannot show you your age");

    }
}
