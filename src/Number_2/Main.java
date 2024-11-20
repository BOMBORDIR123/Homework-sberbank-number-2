package Number_2;

public class Main {
    public static void main(String[] args) {
        //Создание телефонного справочника
        phoneDirectory directory = new phoneDirectory();

        //Добавление записей
        directory.add("Лысенко", "+7(989)-79-48");
        directory.add("Смирнов", "+7(989)-15-14");
        directory.add("Ковалёв", "+7(988)-14-17");
        directory.add("Лысенко", "+7(989)-94-58");
        directory.add("Ковалёв", "+7(999)-41-75");

        //Поиск номеров телефонов по фамилии
        System.out.print("Номера Лысенко: ");
        System.out.println(directory.get("Лысенко"));

        System.out.print("Номера Смирнова: ");
        System.out.println(directory.get("Смирнов"));

        System.out.print("Номера Ковалёва: ");
        System.out.println(directory.get("Ковалёв"));

        System.out.print("Номера отсутствующих в справочнике: ");
        System.out.println(directory.get("Иванов"));
    }
}