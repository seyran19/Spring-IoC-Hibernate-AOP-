package Repeat.AOP.AfterThrowing;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Student {

    private final List<Integer> agesList;

    public Student() {
        this.agesList =  List.of(1, 2, 3);
    }

    public int GetSomeAge(){
        return agesList.get(4);
    }
}
