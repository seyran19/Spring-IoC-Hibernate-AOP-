package Repeat.AOP.AfterReturning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> students = new ArrayList<Student>();

    public List<Student> addStudents(){
        Student student1 = new Student("Seiran", 18, 7.1);
        Student student2 = new Student("Valera", 23, 5.9);
        Student student3 = new Student("Tarik", 29, 8.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;
    }

    public Student getStudent(int index){
        return students.get(index);
    }
}
