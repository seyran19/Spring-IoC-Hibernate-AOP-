package Repeat.Hibernate.Entity;

import Repeat.Hibernate.Entity.Schemas.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {
    public static void main(String[] args) {

        SessionFactory factory  = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try(factory){

            try(Session session = factory.openSession()){

                session.beginTransaction();

                Employee employee = session.get(Employee.class, 7);
                session.remove(employee);

                session.getTransaction().commit();


                session.getTransaction().begin();

                session.createQuery("Delete from Employee where name = 'Seiran'")
                        .executeUpdate();

                session.getTransaction().commit();
            }
        }
    }
}
