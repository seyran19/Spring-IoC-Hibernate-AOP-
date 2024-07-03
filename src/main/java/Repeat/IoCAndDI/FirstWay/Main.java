package Repeat.IoCAndDI.FirstWay;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context =
                    new ClassPathXmlApplicationContext("RepeatIocAndDI/FirstWay/applicationContextFirst.xml")) {
            Person myPerson = context.getBean("MyPerson", Person.class);
            myPerson.callYourPet();
        }
    }
}
