package Repeat.IoCAndDI.FirstWay;

public class Person {

    private Pet pet;
    private int age;
    private String name;


    Person(Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet!");
        pet.voice();
    }
}
