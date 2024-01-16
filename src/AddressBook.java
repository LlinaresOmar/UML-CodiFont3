import java.util.ArrayList;

public class AddressBook {

    private int code;
    private ArrayList<Person> persons;


    public AddressBook(int code) {
        this.code = code;
    }

    public AddressBook(int code, ArrayList<Person> persons) {
        this.code = code;
        this.persons = persons;
    }

}
