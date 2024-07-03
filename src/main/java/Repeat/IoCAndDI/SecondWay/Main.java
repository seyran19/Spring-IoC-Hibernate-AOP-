package Repeat.IoCAndDI.SecondWay;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context =
                    new ClassPathXmlApplicationContext("RepeatIocAndDI/SecondWay/applicationContextSecond.xml")) {
            Person myPerson = context.getBean("person", Person.class);
            myPerson.callYourPet();
        }
    }
}
