package HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Start {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Departament departament = new Departament("IT", 800, 1200);
        Employees employee1 = new Employees("Ivan", "Ivanov", 500);
        Employees employee2 = new Employees("Sasha", "Petrova", 800);

        departament.setEmployeeyToDepartement(employee1);
        departament.setEmployeeyToDepartement(employee2);


        session.beginTransaction();
        session.save(departament);

        session.getTransaction().commit();
        System.out.println("Done!!");
    }
}
