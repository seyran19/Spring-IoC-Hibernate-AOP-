package Repeat.Hibernate.OneToOne.OneToOneUnitDirect;


import Repeat.Hibernate.OneToOne.OneToOneUnitDirect.Entity.Detail;
import Repeat.Hibernate.OneToOne.OneToOneUnitDirect.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        try (factory) {
            try (Session session = factory.openSession()) {

                Detail detail = new Detail();
                Employee employee = new Employee("Nigar", "Dzhafarovz", "IT", 500, detail);

                session.beginTransaction();

                session.persist(employee);

                session.getTransaction().commit();

            }
        }

    }
}
