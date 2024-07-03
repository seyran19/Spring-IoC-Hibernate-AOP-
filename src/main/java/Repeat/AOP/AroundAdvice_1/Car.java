package Repeat.AOP.AroundAdvice_1;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public String returning() {
        System.out.println("Returning car");
        return "Mazda";
    }
}
