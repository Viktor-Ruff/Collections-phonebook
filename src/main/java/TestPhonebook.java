import java.util.HashSet;
import java.util.Set;

public class TestPhonebook {

    public static void main(String[] args) {


        Phonebook<String, HashSet<String>> workPhonebook = new Phonebook<>();

        workPhonebook.addContact("Dmitry","+7 999 444 67 32");
        workPhonebook.addContact("Sergey","+7 777 333 43 36");
        workPhonebook.addContact("Andrey","+7 495 999 11 22");
        workPhonebook.addContact("Semen","+7 495 999 11 22");
        workPhonebook.addContact("Andrey","+7 595 278 66 77");
        workPhonebook.addContact("Sergey","+7 193 444 88 73");
        workPhonebook.addContact("Svetlana","+7 763 197 33 28");

        workPhonebook.printPhonebook();

        workPhonebook.getPhoneNumber("Andrey");




    }
}
