package Repeat.Hibernate.Entity;

import Repeat.Hibernate.Entity.Schemas.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try(factory){

            try(Session session = factory.openSession()){

                session.beginTransaction();

                Employee emp = session.get(Employee.class, 7);
                emp.setSalary(1500);

                session.createQuery("update Employee set salary = 2500 where id = 8")
                                .executeUpdate();

                session.getTransaction().commit();
            }
        }

    }
}
