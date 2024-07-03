package Repeat.AOP.AroundAdvice_2;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class Plane {

    public String takeOff(){
       int x =  1/0;
       return "AirBus";
    }
}
