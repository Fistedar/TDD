import java.util.Map;
import java.util.Set;
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

    public String findByName(String name) {
        Set<Map.Entry<String, String>> entrySet = phoneBook.entrySet();
        String phoneNumber = null;
        for (Map.Entry<String, String> nameNumber : entrySet) {
            if (name.equals(nameNumber.getValue())) {
                phoneNumber = nameNumber.getKey();
            }
        }
        return phoneNumber;
    }

    public String printAllNames() {
        return phoneBook.keySet().toString();
    }
}
