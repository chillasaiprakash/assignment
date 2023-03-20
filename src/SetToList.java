import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
    public static void main(String[] args)
    {
        Set<Employee> setValues= new HashSet<>();
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("prakash",23L," developer",30080L,5L));
        setValues.add(new Employee("chilla",23L,"senior devops developer",34000L,6L));
for(Employee employee:setValues) {
    System.out.println(employee);
}
        List<Employee> empList=new ArrayList<>();
        for(Employee emp:setValues)
        {
            empList.add(emp);

        }
        System.out.println(empList);
    }

}
