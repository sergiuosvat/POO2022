public class Employee {
    String name;
    Integer age;
    Double salary;

    public Employee(String name, Integer age, Double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
