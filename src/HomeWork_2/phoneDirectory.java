package HomeWork_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneDirectory {
    private Map<String, List<String>> directory;

    //Конструктор создания справочника
    public phoneDirectory() {
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
