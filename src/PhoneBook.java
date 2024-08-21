import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<String> list_phone = new ArrayList<>();
            list_phone.add(phoneNum);
            phoneBook.put(name, list_phone);
        }
    }

    public void print() {
        phoneBook.entrySet().stream()
                .sorted(new Comparator<Map.Entry<String, ArrayList<String>>>() {
                    @Override
                    public int compare(Map.Entry<String, ArrayList<String>> k1, Map.Entry<String, ArrayList<String>> k2) {
                        return k2.getValue().size() - k1.getValue().size();
                    }
                }).forEach(System.out::println);
    }
}

