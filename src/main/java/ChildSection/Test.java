package ChildSection;

import HibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

           Session session = HibernateUtil.getSessionFactory().getCurrentSession();

            Section section1 = new Section("Football");
            Child child1 = new Child("Ivan", 12);
            Child child2 = new Child("Olef", 15);
            Child child3 = new Child("Sasha", 13);

            section1.addChiltToSection(child1);
            section1.addChiltToSection(child2);
            section1.addChiltToSection(child3);

            session.beginTransaction();
            session.save(section1);


            session.getTransaction().commit();
            System.out.println("Done");

    }
}
