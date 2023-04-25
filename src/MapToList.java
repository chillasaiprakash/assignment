import java.util.*;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer, Employ> employMap = new HashMap<>();

        Employ employ1 = new Employ("John", null, 123);
        Employ employ5 = new Employ("John", "mac", 123);
        Employ employ2 = new Employ("Jane", "Band", 456);
        Employ employ3 = new Employ("Bob", "Smith", 789);

        employMap.put(1, employ1);
        employMap.put(2, employ2);
        employMap.put(3, employ3);
        employMap.put(4, null);
        employMap.put(5, employ5);
        System.out.println(employMap);
        Set<Map.Entry<Integer,Employ>> entrySet=employMap.entrySet();
        System.out.println(entrySet);
        List<Map.Entry<Integer,Employ>> entryList=new ArrayList<>(entrySet);
        System.out.println(entryList);

    }
}
