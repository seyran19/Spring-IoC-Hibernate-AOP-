package Repeat.IoCAndDI.FirstWay;

public class Cat implements Pet {

    @Override
    public void voice() {
        System.out.println("Meow-Meow!");
    }

    public void init(){
        System.out.println("Hello i am Cat!");
    }
}
