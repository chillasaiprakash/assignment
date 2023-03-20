import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapToSet {
    public static void  main(String[] args) {


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
        for (Map.Entry<Integer, Employ> entery : employMap.entrySet()) {

            if(null!=entery.getValue()) {
                //System.out.println(entery);
                System.out.println(entery.getValue().getId());
            }
            System.out.println(entery);
        }

        Set<Employ> mapToSet=new HashSet<>(employMap.values());
       System.out.println(mapToSet);
        //System.out.println(employMap.);
    }
}
