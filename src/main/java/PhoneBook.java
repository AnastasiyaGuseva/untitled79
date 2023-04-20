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
}
