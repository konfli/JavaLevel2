package homework3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> pb;

    public PhoneBook() {
        this.pb = new HashMap<>();
    }

    public void add(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void get(String name) {
        System.out.println("Контакт " + name + " / тел: " + pb.getOrDefault(name, new HashSet<>()));
    }
}

