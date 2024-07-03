package Repeat.AOP.AroundAdvice_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context
                    = new AnnotationConfigApplicationContext(Repeat.AOP.Before_And_Aspects.MyConfig.class)) {

            Car car = context.getBean("car", Car.class);
            String returning = car.returning();

            System.out.println("Вернули машину - "  + returning);
        }
    }
}
