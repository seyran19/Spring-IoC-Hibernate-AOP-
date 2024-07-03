package Repeat.Hibernate.Entity;

import Repeat.Hibernate.Entity.Schemas.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GET {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try (factory){
            try (Session session = factory.openSession()) {

                // Получаем объект по id
                session.beginTransaction();
                Employee employee = session.get(Employee.class, 7);
                //System.out.println(employee);
                session.getTransaction().commit();

                // Получение всех объектов
                session.beginTransaction();
                List<Employee> employees = session.createQuery("from Employee", Employee.class).getResultList();
                //employees.forEach(System.out::println);
                session.getTransaction().commit();

                //Фильтрация
                session.beginTransaction();
                Employee employee2 = session.createQuery("from Employee where name = 'Seiran'", Employee.class).getSingleResultOrNull();
                //System.out.println(employee2);
                session.getTransaction().commit();
            }


        }
    }
}
