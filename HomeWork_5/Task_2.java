package HomeWork_5;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task_2 {
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>();
        employees.put("Ivanov", "Ivan");
        employees.put("Petrova", "Svetlana");
        employees.put("Belova", "Kristina");
        employees.put("Musina", "Anna");
        employees.put("Krutova", "Anna");
        employees.put("Urin", "Ivan");
        employees.put("Likov", "Petr");
        employees.put("Chernov", "Pavel");
        employees.put("Chernishov", "Petr");
        employees.put("Fedorova", "Mariya");
        employees.put("Svetlova", "Marina");
        employees.put("Savina", "Mariya");
        employees.put("Rikova", "Mariya");
        employees.put("Lugova", "Marina");
        employees.put("Vladimirova", "Anna");
        employees.put("Mechnikov", "Ivan");
        employees.put("Petin", "Petr");
        employees.put("Ezhov", "Ivan");
        employees.entrySet().forEach(System.out::println);
        System.out.println();
        Map<String, Integer> repeat = new TreeMap<>();
        for(Map.Entry<String, String> entry : employees.entrySet()) {
            if (repeat.containsKey(entry.getValue())) {
                repeat.put(entry.getValue(), repeat.get(entry.getValue())+ 1);
            } else {
                repeat.put(entry.getValue(), 1);
            }
        }
        //сортировка по ключу
        repeat.entrySet().forEach(System.out::println);
        System.out.println();
        //сортировка по значению
        repeat.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);
    }
}
