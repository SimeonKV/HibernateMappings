import Student.Address;
import Student.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("student-demo");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tr = em.getTransaction();
        tr.begin();

        Person simo = new Person();
        simo.setName("Simeon");
        em.persist(simo);

        Address address = new Address();
        address.setName("Pirin");
        address.setPerson(simo);



        Address adaTwo = new Address();
        adaTwo.setName("Rila");
        adaTwo.setPerson(simo);

        Address addTher = new Address();
        addTher.setName("Svoboda");

        em.persist(address);
        em.persist(adaTwo);
        em.persist(addTher);



        tr.commit();


    }
}
