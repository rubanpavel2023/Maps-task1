package src.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class PersonRegistry {

    private Map<String, String> personRegistry;
    private boolean isInitialContacts;
    private Scanner scanner;

    public PersonRegistry() {
        this.personRegistry = new LinkedHashMap<>();
        this.scanner = new Scanner(System.in);
        this.isInitialContacts = true;
    }

    public void createContactList() {
        if (isInitialContacts) {
            System.out.println("Initial contacts:");
        } else {
            System.out.println("Updated contacts:");
        }
        printContacts();
    }

    public void addOrUpdateContact(String name, String email) {
        String existingEmail = personRegistry.get(name);
        if (existingEmail != null) {
            personRegistry.put(name, email);
        } else {
            personRegistry.put(name, email);
        }
        isInitialContacts = false;
    }

    AtomicInteger counter = new AtomicInteger(1);

    private void printContacts() {
        counter.set(1);
        for (Map.Entry<String, String> entry : personRegistry.entrySet()) {
            System.out.println(counter.getAndIncrement() + ") " + entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
    }
}



