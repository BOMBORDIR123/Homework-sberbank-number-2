package Number_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    //Конструктор создания справочника
    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    //Метод добавления записи
    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    //Метод поиска номеров по фамилии
    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }
}
