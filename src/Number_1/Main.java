package Number_1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Создание массива слов
        String[] words = {
                "sun", "moon", "sun", "star", "moon", "planet", "sun", "comet",
                "star", "galaxy", "moon", "planet", "asteroid", "sun", "satellite", "milky way", "star"
        };

        //Создание коллекции Map, группировка и подсчёт элементов
        Map<String, Long> wordCounts = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //Вывод каждого слова и количетсво вхождений
        System.out.println("Уникальные слова и количество повторений");
        wordCounts.forEach((word, count) -> System.out.println(word + ": " + count + " повторения"));
    }
}
