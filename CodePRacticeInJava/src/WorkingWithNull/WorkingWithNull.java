package WorkingWithNull;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class WorkingWithNull {
    public static void main(String[] args) {
        Map<Integer, String> symphony = new HashMap<>();
        symphony.put(null, "Beans");
        symphony.put(1, "rice");
        symphony.put(2, "yam");
        symphony.put(null, null);
        symphony.put(3, null);
        symphony.put(4, null);
        System.out.println(symphony);
        System.out.println("The size of the map is "+ symphony.size());
    }
}
