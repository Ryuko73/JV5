import java.util.*;

public class RepeatedNames {
    public static void main(String[] args) {
        String[] employeeNames = {
            "Svetlana Petrova", "Kristina Belova", "Anna Musina", "Anna Krutova",
            "Ivan Yurin", "Petr Lykov", "Pavel Chernov", "Pyotr Chernyshov",
            "Maria Fedorova", "Marina Svetlova", "Ivan Savin", "Maria Rykova",
            "Marina Lugova", "Anna Vladimirova", "Ivan Mechnikov", "Petr Petin",
            "Ivan Ezhov"
        };

        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : employeeNames) {
            int count = nameCounts.getOrDefault(name, 0);
            nameCounts.put(name, count + 1);
        }

        List<Map.Entry<String, Integer>> sortedCounts = new ArrayList<>(nameCounts.entrySet());
        Collections.sort(sortedCounts, (a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : sortedCounts) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
