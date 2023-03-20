import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<Employee> data = new ArrayList<>(
                Arrays.asList(
                        new Employee("Sai", 40L, "senior developer", 30000L, 5L),
                        new Employee("vamsi", 27L, "senior java  developer", 130000L, 15L),
                        new Employee("prakash", 31L, "senior fs developer", 110000L, 5L),
                        new Employee("Saiprakash", 29L, "Full stack developer developer", 120000L, 5L),
                        new Employee("sp", 24L, "Software developer", 140000L, 5L)
                )
        );
        System.out.println(data);
        Set<Employee> stValues=new HashSet<>();
        for(Employee empData:data)
        {
            stValues.add(empData);
        }
           System.out.println(stValues);
    }
}
