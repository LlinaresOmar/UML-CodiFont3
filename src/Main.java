import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Country c1 = new Country(1, "España");

        State s1 = new State(1, "C.Valenciana",c1);

        Address a1 = new Address("C/Quintana", "Villajoyosa", 03570);

        AddressBook ab1 = new AddressBook(1);

        Person p1 = new Person("Yo", 690199557, "yo@gmail.com", a1, ab1);
        Person p2 = new Person("Tu", 690199557, "tu@gmail.com", a1, ab1);

        ArrayList<Person> personitas = new ArrayList<>();
        personitas.add(p1);
        personitas.add(p2);

        AddressBook ab2 = new AddressBook(2, personitas);
    }
}
