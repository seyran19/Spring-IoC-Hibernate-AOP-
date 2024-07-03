package Repeat.AOP.Before_And_Aspects.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {
    @Before("Repeat.AOP.Before_And_Aspects.PountCuts.PointCut.allGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("-A- allGetMethods");

    }
}
