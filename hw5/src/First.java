    import java.util.*;

public class FirstTask {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
         }
         public static void printBook(Map<String, ArrayList<Integer>> map){
            for (var item : map.entrySet()) {
                String phones = "";
                for(int el: item.getValue()){
                    phones = phones + el + "";
                }
                System.out.printf("%s: %s \n", item.getKey(), phones);
            }
        }
}
}

