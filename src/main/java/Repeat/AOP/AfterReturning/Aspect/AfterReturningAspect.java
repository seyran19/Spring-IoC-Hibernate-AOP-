package Repeat.AOP.AfterReturning.Aspect;

import Repeat.AOP.AfterReturning.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class AfterReturningAspect {

    @AfterReturning(pointcut = "execution(* addStudents(..))", returning = "list")
    public void AfterReturningForAddStudents(ArrayList<Student> list) {
        Student first = list.get(0);
        String name = first.getName();
        name = "Mr." + name;
        first.setName(name);

        first.setAvgGrade(10.0);

        System.out.println("\n--AfterReturningAspect--");
    }
}
