import java.util.*;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {
        List<Employee> data = new ArrayList<>(
                Arrays.asList(
                        new Employee("sai", 40L, "senior developer", 30000L, 5L),
                        new Employee("vamsi", 27L, "senior java  developer", 130000L, 15L),
                        new Employee("prakash", 31L, "senior fs developer", 110000L, 5L),
                        new Employee("saiprakash", 29L, "Full stack developer developer", 120000L, 5L),
                        new Employee("sp", 24L, "Software developer", 140000L, 5L)
                )
        );

        List<Employee> sortedList=data.stream().filter(d->d.getFirstName().equals("vamsi")).collect(Collectors.toList());
        System.out.println(sortedList);
       /* List<Employee> sortedList=data.stream().sorted(Comparator.comparing(Employee::getFirstName))
                .filter(d->d.getSalary().equals(30000L)).collect(Collectors.toList());*/

       //data.sort(Comparator.comparing(Employee::getFirstName));
       // System.out.println(data);

       // String employeeName = "v%";

            /* data.stream()
                    .filter(s -> s.getFirstName().toUpperCase().startsWith("V"))
                     .map(Employee::getFirstName)
                    .forEach(System.out::println);*/

        }
            // System.out.println(data);
            // Set<Employee> stValues=new HashSet<>();
            //for(Employee empData:data)
            //   {
            //          stValues.add(empData);
            //      }
            //     System.out.println(stValues);
        }


