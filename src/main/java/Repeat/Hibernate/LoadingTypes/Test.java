package Repeat.Hibernate.LoadingTypes;


import Repeat.Hibernate.LoadingTypes.Entity.Department;
import Repeat.Hibernate.LoadingTypes.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        try (factory) {
            try (Session session = factory.openSession()) {
                session.beginTransaction();

                System.out.println("show department");
                Department department = session.get(Department.class, 1);
                System.out.println(department);

                System.out.println("show employee");
                department.getEmployees().forEach(System.out::println);


                session.getTransaction().commit();

            }
        }

    }
}
