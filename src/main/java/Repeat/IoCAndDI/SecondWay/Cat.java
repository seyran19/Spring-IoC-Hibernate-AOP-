package Repeat.IoCAndDI.SecondWay;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {

    @Override
    public void voice() {
        System.out.println("Meow-Meow!");
    }

}
