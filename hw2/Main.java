package hw2;
import java.util.Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
                Map<String, String> map; {
                    map = new HashMap<String, String>();
                    map.put("name", "Ivanov");
                    map.put("country", "Russia");
                    map.put("city", "Moskow");
                    map.put("age", null);
                FirstTask firstTask = new FirstTask();
                System.out.println(firstTask.getResult(map));
        
            }
}
}
