public class Employee {

    private String firstName;
    private Long age;
    private String designation;
    private Long salary;
    private Long noOfExperience;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", noOfExperience=" + noOfExperience +
                '}';
    }

    public Employee(String firstName, Long age, String designation, Long salary, Long noOfExperience) {
        this.firstName = firstName;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        this.noOfExperience = noOfExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getNoOfExperience() {
        return noOfExperience;
    }

    public void setNoOfExperience(Long noOfExperience) {
        this.noOfExperience = noOfExperience;
    }



}
