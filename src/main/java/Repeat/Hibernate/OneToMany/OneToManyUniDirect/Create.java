package Repeat.Hibernate.OneToMany.OneToManyUniDirect;


import Repeat.Hibernate.OneToMany.OneToManyUniDirect.Entity.Department;
import Repeat.Hibernate.OneToMany.OneToManyUniDirect.Entity.Employee;
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
                Employee emp1 = new Employee("Nigar", "Dzhafarova", 300);

                department.addEmployee(emp1);
                session.persist(department);


                session.getTransaction().commit();

            }
        }

    }
}
