package Repeat.IoCAndDI.ThirdWay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(MyConfig.class)) {
            Person myPerson = context.getBean("person", Person.class);
            myPerson.callYourPet();
        }
    }
}
