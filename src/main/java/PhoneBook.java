import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String num) {
        phoneBook.put(name, num);
        return phoneBook.size();
    }

    public String findByNumber(String name) {
        return phoneBook.get(name);
    }
}
