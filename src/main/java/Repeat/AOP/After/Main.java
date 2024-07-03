package Repeat.AOP.After;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext(Repeat.AOP.Before_And_Aspects.MyConfig.class)) {
            S student = context.getBean("studentBean", S.class);
            student.getSomeAge();

        }
    }
}
