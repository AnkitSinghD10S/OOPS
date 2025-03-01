package employeepayroll;
import java.util.*;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name="+name+", id ="+id+", salary ="+calculateSalary()+" ]";
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public  FullTimeEmployee(String name, int id ,double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }
    
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursworked;
    private int hourlyRate;

    public PartTimeEmployee(String name,int id, int hoursworked,int hourlyRate){
        super(name, id);
        this.hoursworked = hoursworked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    double calculateSalary(){
        return hourlyRate*hoursworked;
    }
}

public class EmployeePayRoll {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee fte1 = new FullTimeEmployee("John", 1, 5000);
        FullTimeEmployee fte2 = new FullTimeEmployee("Mike", 2, 6000);
        PartTimeEmployee pte1 = new PartTimeEmployee("Linda", 3, 20, 100);
        PartTimeEmployee pte2 = new PartTimeEmployee("Linda", 4, 25, 150);
        payrollSystem.addEmployee(fte1);
        payrollSystem.addEmployee(fte2);
        payrollSystem.addEmployee(pte1);
        payrollSystem.addEmployee(pte2);
        payrollSystem.displayAllEmployees();
    }
}

class PayrollSystem{
     private List<Employee> employeeList = new ArrayList<Employee>();

     public PayrollSystem(){
        employeeList= new ArrayList<Employee>();
     }

     public void addEmployee(Employee employee){
        employeeList.add(employee);
     }

     public void removeEmployee(int id){
        Employee emp = null;
        for(Employee e: employeeList){
            if(e.getId()==id){
                emp =e;
                break;
            }
        }
        if(emp!=null){
            employeeList.remove(emp);
        }
     }

     public void displayAllEmployees(){
        for(Employee e: employeeList){
            System.out.println(e);
        }
     }
}