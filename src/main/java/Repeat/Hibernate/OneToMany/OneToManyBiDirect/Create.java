package Repeat.Hibernate.OneToMany.OneToManyBiDirect;


import Repeat.Hibernate.OneToMany.OneToManyBiDirect.Entity.Employee;
import Repeat.Hibernate.OneToMany.OneToManyBiDirect.Entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        try (factory) {
            try (Session session = factory.openSession()) {
                session.beginTransaction();

                Department department = new Department("IT", 300, 1200);
                Employee emp1 = new Employee("Zaur", "Tregulov", 800);
                Employee emp2 = new Employee("Seiran", "Dzhafarov", 1200);

                department.addEmployee(emp1);
                department.addEmployee(emp2);
                session.persist(department);


                session.getTransaction().commit();

            }
        }

    }
}
