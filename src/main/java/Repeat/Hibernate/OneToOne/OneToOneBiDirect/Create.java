package Repeat.Hibernate.OneToOne.OneToOneBiDirect;


import Repeat.Hibernate.OneToOne.OneToOneBiDirect.Entity.Detail;
import Repeat.Hibernate.OneToOne.OneToOneBiDirect.Entity.Employee;
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

                Detail detail = new Detail("Baku", "89158252108", "sergo@asaqw.com");
                Employee employee = new Employee("Seiran", "Dzhafarov", "IT", 12500, detail);

                session.beginTransaction();

                detail.setEmployee(employee);
                session.persist(employee);
//                Detail detail1 = session.get(Detail.class, 2);
//                System.out.println(detail1.getEmployee());

                Detail detail2 = new Detail("Madrid", "89158252108", "---sergo@asaqw.com");
                Employee employee1 = new Employee();
                employee1.setName("Valera");
                detail2.setEmployee(employee1);
                employee1.setEmpDetail(detail2);

                session.persist(detail2);

                session.getTransaction().commit();

            }
        }

    }
}
