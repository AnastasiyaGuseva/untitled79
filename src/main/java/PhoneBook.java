import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    static Map<String, String> phoneBook = new TreeMap<>();

    public static int add(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (phoneBook.get(entry.getKey()).equals(number)) {
                    return entry.getKey();
                }
            }
        }
        return "No name";
    }

    public static String findByName(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return "No number";
    }
    public static String printAllNames(){
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            builder.append(entry.getKey()).append(" ");
        }
        return  builder.toString();
    }
}
