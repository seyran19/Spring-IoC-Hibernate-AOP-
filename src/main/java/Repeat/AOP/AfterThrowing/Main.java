package Repeat.AOP.AfterThrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext(Repeat.AOP.Before_And_Aspects.MyConfig.class)) {
            Student student = context.getBean("student", Student.class);
            student.GetSomeAge();

        }
    }
}
