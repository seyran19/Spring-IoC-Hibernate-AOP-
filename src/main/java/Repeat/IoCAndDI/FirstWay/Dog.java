package Repeat.IoCAndDI.FirstWay;

public class Dog implements Pet{

    @Override
    public void voice(){
        System.out.println("Wow-Bow!");
    }

    public void init(){
        System.out.println("Hello i am Dog!");
    }
}
