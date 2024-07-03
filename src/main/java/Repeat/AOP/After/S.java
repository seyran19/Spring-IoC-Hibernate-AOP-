package Repeat.AOP.After;

import org.springframework.stereotype.Component;

import java.util.List;
@Component("studentBean")
public class S {

    private final List<Integer> agesList;

    public S() {
        this.agesList =  List.of(1, 2, 3);
    }

    public int getSomeAge(){
        return agesList.get(1);
    }
}
