package Student;



import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinTable(name = "people_addresses",
    joinColumns = { @JoinColumn(name = "address_id")},
    inverseJoinColumns ={@JoinColumn(name = "person_id")} )
    private Person person;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getAddress() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
