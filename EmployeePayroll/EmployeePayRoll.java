
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
        // FullTimeEmployee fulltime[] = new FullTimeEmployee[5];
        // fulltime[0] = new FullTimeEmployee("ankit", 0, 100000000);
        // fulltime[0].calculateSalary();
    }
}