package Repeat.Hibernate.ManyToMany;

import Repeat.Hibernate.ManyToMany.Entity.Child;
import Repeat.Hibernate.ManyToMany.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("Repeat/Hibernate/hibernate.cfg.XML")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        try (factory) {

            try (Session session = factory.openSession()) {

                Section basketballSection = new Section("Basketball");
                Child firstChild = new Child(6, "Bob");
                Child secondChild = new Child(7, "Jocelyn");
                Child ThirdChild = new Child(8, "Andrew");
                basketballSection.addChild(firstChild);
                basketballSection.addChild(secondChild);
                basketballSection.addChild(ThirdChild);


                session.beginTransaction();

//                session.persist(basketballSection);

//                Child child = session.get(Child.class, 10);
//                System.out.println(child.getSections());

//                session.remove(session.get(Section.class, 5));

                session.getTransaction().commit();
            }
        }
    }
}
