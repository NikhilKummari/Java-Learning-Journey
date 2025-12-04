public class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee() {
        System.out.println("This is a Default Constructor");
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void printEmployee(){
        System.out.println("ID : " +id);
        System.out.println("Name : " +name);
        System.out.println("Department : " +department);
        System.out.println("Salary : " + salary);

    }

    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id= 1;
        e1.name= "Nikhil";
        e1.department="Dev";
        e1.salary=1000.0;

        Employee e2 = new Employee(2, "alice", "dev", 13000.0);
        e2.printEmployee();

    }
}
