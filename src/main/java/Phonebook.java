import java.util.*;
import java.util.function.BiFunction;

public class Phonebook<E, H extends AbstractSet<E>> {

    Map<E, List<E>> phonebook;
    List<E> phoneNumberList;

    public Phonebook() {
        this.phonebook = new HashMap<>();

    }

    public void addContact(E nameContact, E phoneNumber) {

        if (phonebook.containsKey(nameContact)) {
            phoneNumberList = phonebook.get(nameContact);
            phoneNumberList.add(phoneNumber);
            phonebook.put(nameContact, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            phonebook.put(nameContact, phoneNumberList);
        }

    }

    public void printPhonebook() {
        System.out.println(phonebook);
    }

    public void getPhoneNumber(E name) {
        System.out.printf("%s: %s \n", name, phonebook.get(name));
    }

    public void clearPhoneBook() {
        phonebook.clear();
    }

}
