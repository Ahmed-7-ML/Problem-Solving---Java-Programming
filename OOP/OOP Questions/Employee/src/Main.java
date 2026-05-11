/*
Create an encapsulated `Employee` class with private fields
    `name`, `salary`, and `department`.

Add getters for all fields and a setter for `salary` that rejects any value below 3000.

In `main`, try setting a valid and an invalid salary.
*/

class Employee{
    private String name;
    private String department;
    private double salary;

    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        setSalary(salary);
    }

    // Getters
    void getName() { System.out.println("Name: " + name); }
    void getDepartment(){ System.out.println("Department: " + department); }
    void getSalary(){ System.out.println("Salary: " + salary); }

    // Setter
    void setSalary(double salary){
        if(salary >= 3000)
            this.salary = salary;
        else
            System.out.println("ERROR: Minimum Salary is $3000, Please " + name + " enter valid salary.");
    }
}

public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee("Ahmed", "CSE", 10021);
        e1.getName();
        e1.getDepartment();
        e1.getSalary();


        Employee e2 = new Employee("Omar", "CSE", 1021);
        e2.getName();
        e2.getDepartment();
        e2.getSalary();

        e2.setSalary(100021);
        e2.getSalary();

    }
}