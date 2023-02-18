import java.util.*;

public class Phonebook {
    private Map<String, List<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<String, List<String>>();
    }

    public void addContact(String name, String phoneNumber) {
        if (this.phonebook.containsKey(name)) {
            List<String> phoneNumbers = this.phonebook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<String>();
            phoneNumbers.add(phoneNumber);
            this.phonebook.put(name, phoneNumbers);
        }
    }

    public List<String> getPhoneNumbers(String name) {
        return this.phonebook.get(name);
    }

    public void printPhonebook() {
        for (Map.Entry<String, List<String>> entry : this.phonebook.entrySet()) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addContact("Анна", "123-456-7890");
        phonebook.addContact("Николай", "111-222-3333");
        phonebook.addContact("Анна", "555-666-7777");

        phonebook.printPhonebook();
    }
}
