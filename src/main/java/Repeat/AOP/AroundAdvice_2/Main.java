package Repeat.AOP.AroundAdvice_2;

import Repeat.AOP.AroundAdvice_1.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context
                    = new AnnotationConfigApplicationContext(Repeat.AOP.Before_And_Aspects.MyConfig.class)) {

            Plane plane = context.getBean("plane", Plane.class);
            String returning = plane.takeOff();

            System.out.println("Вернули машину - "  + returning);
        }
    }
}
