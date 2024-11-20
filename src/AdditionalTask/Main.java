package AdditionalTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Количество элементов
        int numElements = 10000000;

        //Создание двух массивов
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //Заполнение и подсчёт затраченного времени в ArrayList
        long startTimeA = System.nanoTime();
        fillList(arrayList, numElements);
        long endTimeA = System.nanoTime();
        long elapsedTimeA = endTimeA - startTimeA;

        System.out.println("Затраченное время: " + elapsedTimeA + " ns");

        //Заполнение и подсчёт затраченного времени в LinkedList
        long startTimeL = System.nanoTime();
        fillList(linkedList, numElements);
        long endTimeL = System.nanoTime();
        long elapsedTimeL = endTimeL - startTimeL;
        System.out.println("Затраченное время: " + elapsedTimeL + " ns");

        //Поиск и подсчёт затраченного времени в ArrayList
        long startTimeAS = System.nanoTime();
        searchList(arrayList, numElements);
        long endTimeAS = System.nanoTime();
        long elapsedTimeAS = endTimeAS - startTimeAS;
        System.out.println("Затраченное время: " + elapsedTimeAS + " ns");

        //Поиск и подсчёт затраченного времени в LinkedList
        long startTimeLS = System.nanoTime();
        searchList(linkedList, numElements);
        long endTimeLS = System.nanoTime();
        long elapsedTimeLS = endTimeLS - startTimeLS;
        System.out.println("Затраченное время: " + elapsedTimeLS + " ns");
    }

    //Функция заполения массива
    public static void fillList (List<Integer> list, int numElements) {
        Random random = new Random();
        for (int i = 0; i < numElements; i++) {
            list.add(random.nextInt());
        }
    }

    //Функция поиска массива
    public static void searchList (List<Integer> list, int numElements) {
        int lastIndex = list.get(numElements - 1);
        list.indexOf(lastIndex);
    }
}
