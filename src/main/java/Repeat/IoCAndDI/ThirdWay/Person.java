package Repeat.IoCAndDI.ThirdWay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Person {

    private Pet pet;
    private int age;
    private String name;

    @Autowired
    Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Value("${person.age}")
    public void setAge(int age) {
        this.age = age;
    }

    @Value("${person.name}")
    public void setName(String name) {
        this.name = name;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet!");
        pet.voice();
    }
}
