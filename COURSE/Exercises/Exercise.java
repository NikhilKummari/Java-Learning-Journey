class Employee{
    private String name;
    private double salary;

    public Employee() {
    }

    
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDetails(){
        return "Name : " + name + ", Salary :" + salary;
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String getDetails(){
        return "Name : " + getName() + ", Salary :" + getSalary() + ", Department : " + getDepartment();
    }
}

public class Exercise {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000.0);
        System.out.println(emp.getDetails());

        Manager mgr = new Manager("Bob", 80000.0, "IT");
        System.out.println(mgr.getDetails());
    }
}
