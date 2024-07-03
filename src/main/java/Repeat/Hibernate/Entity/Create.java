package Repeat.Hibernate.Entity;

import Repeat.Hibernate.Entity.Schemas.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try (factory) {

            Session session = factory.getCurrentSession();
            Employee employee =
                    new Employee("Nijar", "Dzhafarova", "SSchool", 12);
            session.beginTransaction();

            session.persist(employee);

            session.getTransaction().commit();
        }

    }
}
