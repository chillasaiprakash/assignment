import java.util.*;

        public class ListToMap {
            public static void main(String[] args)
            {
                List<Employee> data=new ArrayList<>(
                        Arrays.asList(
                                new Employee("Sai",40L,"senior developer",30000L,5L),
                                new Employee("vamsi",27L,"senior java  developer",130000L,15L),
                                new Employee("prakash",31L,"senior fs developer",110000L,5L),
                                new Employee("Saiprakash",29L,"Full stack developer developer",120000L,5L),
                                new Employee("sp",24L,"Software developer",140000L,5L)
                        )
                );
        data.stream()
                .filter( sai-> sai.getNoOfExperience()>=5 && sai.getSalary()>90000L      )
                .forEach(System.out::println);


        Map<Long,Employee> mapData=new HashMap<>();
        for(Employee listEmployee:data)
        {
            mapData.put(listEmployee.getAge(),new Employee(listEmployee.getFirstName(), listEmployee.getAge(), listEmployee.getDesignation(),listEmployee.getSalary(),listEmployee.getNoOfExperience()));
            //mapData.put(listEmployee.getAge(),data.get());
        }
        for(Map.Entry<Long,Employee> printMap:mapData.entrySet())
        System.out.println(printMap);

    }
}
