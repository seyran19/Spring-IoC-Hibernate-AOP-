package Repeat.AOP.AfterReturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext(Repeat.AOP.Before_And_Aspects.MyConfig.class)){
            University university = context.getBean("university", University.class);
            university.addStudents();
            System.out.println(university.getStudent(0).getName());
        }
    }
}
