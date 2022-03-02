package code01;

public class Test01 {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setNum(1);
        employee1.setName("张三");
        employee1.setAge(23);
        employee1.setSalary(10000);

        Employee employee2 = new Employee();
        employee2.setNum(2);
        employee2.setName("李四");
        employee2.setAge(22);
        employee2.setSalary(11000);

        Employee[] employees = new Employee[]{employee1, employee2};

        for (int i = 0; i < employees.length; i++) {
            System.out.println("员工 " + (i+1) + " : [编号: " + employees[i].getNum() + ", 姓名:" + employees[i].getName() + ", 年龄:" + employees[i].getAge() + ", 薪资:" + employees[i].getSalary() + "]");
        }
    }
}
