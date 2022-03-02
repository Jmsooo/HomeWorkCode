package code13;

public class Employee {
    private int number;
    private String name;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(int number, String name, int age, int salary) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getInfo() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
