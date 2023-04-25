import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetToMap {
    public static void main(String[] args){
    Set<Employee> setValues= new HashSet<>();
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("sai",23L,"senior developer",31000L,1L));
        setValues.add(new Employee("prakash",23L," developer",30080L,5L));
        setValues.add(new Employee("chilla",23L,"senior devops developer",34000L,6L));
        for (Employee emp:setValues)
        {
            System.out.println(emp);
        }
        Map<Long,Employee> setToMap=new HashMap<>();
        for (Employee emp:setValues)
        for(int i=1;i<=setValues.size();i++)
        {
            setToMap.put(emp.getAge(),new Employee(emp.getFirstName(), emp.getAge(), emp.getDesignation(), emp.getSalary(), emp.getNoOfExperience()));
            //setToMap.put(i,new Employee(setValues.));
        }

}
}
