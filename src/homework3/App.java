package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
    uniqueWordsCounter();
    System.out.println();
    phoneBookDemo();
    }
    public static void phoneBookDemo(){
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Иванов", "111-11-11");
        phonebook.add("Зидан", "211-11-11");
        phonebook.add("Роналду", "311-11-11");
        phonebook.add("Иванов", "411-11-11");
        phonebook.add("Шелби", "511-11-11");
        phonebook.add("Сидоров", "611-11-11");
        phonebook.add("Иванов", "711-11-11");

        phonebook.get("Иванов");
        phonebook.get("Шелби");

    }

    public static void uniqueWordsCounter() {
        String[] words = new String[]{
                "Молоко", "Мясо", "Вода", "Арбуз", "Мясо", "Мясо", "Земляника", "Арбуз", "Вино", "Сидр", "Сидр"};

        List<String> batchOfWords = new ArrayList<>(Arrays.asList(words));

        System.out.println(batchOfWords);

        Set<String> uniqueWords = new HashSet<>(batchOfWords);


        System.out.println(uniqueWords);

        Map<String, Integer> wordCounter = new HashMap<>();
        for (String w : batchOfWords) {
            if (wordCounter.containsKey(w)) {
                Integer count = wordCounter.get(w);
                count++;
                wordCounter.put(w, count);
            } else {
                wordCounter.put(w, 1);
            }
        }

        System.out.println(wordCounter);

    }
}

