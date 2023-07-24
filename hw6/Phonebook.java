import java.util.*;

public class Phonebook {

    public static HashMap<String, ArrayList> persons = new HashMap<>();



    public static void addPerson(String name, String phoneNumber) {
    // public static HashMap<String, ArrayList> persons = new HashMap<>();
    if (persons.containsKey(name)) {
        ArrayList num = persons.get(name);
        num.add(phoneNumber);
        persons.put(name, num);
    } else {
        ArrayList num = new ArrayList<>();
        num.add(phoneNumber);
        persons.put(name, num);
    }
    
    }       

    public static void printListofPersons() {
    ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList(persons.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
        @Override
        public int compare(Map.Entry<String, ArrayList>o1, Map.Entry<String, ArrayList>o2) {
            return o2.getValue().size() - o1.getValue().size();
        }
    });

   for (Map.Entry<String, ArrayList> entry : list) {
    System.out.println(entry.getKey() + " : " + entry.getValue());
   }

}
}

