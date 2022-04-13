import java.util.*;

public class TestHashMap<E> {

    public static void main(String[] args) {

        String[] names = {"Вова", "Арнольд", "Дарья", "Степан", "Гриша", "Вова", "Антон", "Света", "Дарья", "Пётр", "Вова", "Гриша", "Света", "Ян", "Диабольд"};

        getUniqueNames(names);

    }

    private static void getUniqueNames(String[] array) {
        Map<String, Integer> uniqueNames = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (uniqueNames.containsKey(array[i]))
                uniqueNames.put(array[i], uniqueNames.get(array[i]) + 1);
            else
                uniqueNames.put(array[i], 1);
        }
        System.out.println(uniqueNames);
    }
}