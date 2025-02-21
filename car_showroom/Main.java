package car_showroom;

import java.util.Scanner;
import java.util.UUID;

import javax.swing.text.StyledEditorKit;

class Showrooms implements utility{

    String showroom_name;
    String address;
    int total_employees;
    int total_car_in_stock =0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name :"+showroom_name);
        System.out.println("Showroom Address :"+address);
        System.out.println("Total Employees :"+total_employees);
        System.out.println("Manger Name :"+manager_name);
        System.out.println("Total Car In Stock :"+total_car_in_stock);
    }

    @Override
    public void add_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================***** Enter SHOWROOM DETAILS *******==================================");
        System.out.println("Enter Showroom name :");
        showroom_name=sc.nextLine();
        System.out.println("Enter the address :");
        address=sc.nextLine();
        System.out.println("Enter total employees :");
        total_employees=sc.nextInt();
        System.out.println("Enter total cars in stock :");
        total_car_in_stock = sc.nextInt();
        System.out.println("Enter the manager name :");
        manager_name = sc.nextLine();
    }
    
}

class Cars extends Showrooms {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void add_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================***** Enter details *******==================================");
        System.out.println("Enter the car name :");
        car_name=sc.nextLine();
        System.out.println("Enter color :");
        car_color=sc.nextLine();
        System.out.println("Enter car fuel type :");
        car_fuel_type=sc.nextLine();
        System.out.println("Enter the price of car :");
        car_price=sc.nextInt();
        System.out.println("Enter car type (SEDAN/SUV/HATCHBACK):");
        car_type=sc.nextLine();
        System.out.println("Enter the transmission (AUTOMATIC/MANUAL):");
        car_name=sc.nextLine();
        sc.close();
     }
    @Override
    public void get_details(){
        System.out.println("===================================***** CARS details *******==================================");
        System.out.println();
        System.out.println("Car name :"+car_name);
        System.out.println();
        System.out.println("Car color :"+car_color);
        System.out.println();
        System.out.println("Car fuel type:"+car_fuel_type);
        System.out.println();
        System.out.println("Car price :"+car_price);
        System.out.println();
        System.out.println("Car type :"+car_type);
        System.out.println();
        System.out.println("Car transmission :"+car_transmission);
    }
}

class Employees extends Showrooms implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    @Override
    public void add_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("===================================***** Enter details *******==================================");
        System.out.println("Enter the employess name:");
        emp_name=sc.nextLine();
        System.out.println("Enter the employess age :");
        emp_age=sc.nextInt();
        System.out.println("Enter the employess department :");
        emp_department=sc.nextLine();
        sc.close();
    }
    @Override
    public void get_details(){
        System.out.println("===================================***** Employees details *******==================================");
        System.out.println();
        System.out.println("Employee ID :"+emp_id);
        System.out.println();
        System.out.println("Employee name:"+emp_name);
        System.out.println();
        System.out.println("Employee age :"+emp_age);
        System.out.println();
        System.out.println("Employee department :"+emp_department);
    }
}

interface utility {

    public void get_details();

    public void add_details();
    
}

public class  Main{

    public void main_menu(){
        System.out.println();
        System.out.println("===================================***** WELCOME TO THE SHOWROOM MANAGEMENT SYSTEM *******==================================");
        System.out.println();
        System.out.println("===================================***** ENTER YOUR CHOICE *******==================================");
        System.out.println();
        System.out.println("1> ADD SHOWROOM \t\t\t 2> ADD EMPLOYEES \t\t\t  3> ADD CARS ");    
        System.out.println();
        System.out.println("4> GET SHOWROOM  \t\t\t 5> GET EMPLOYEES \t\t\t  6> GET CARS ");    
        System.out.println();
        System.out.println("===================================***** ENTER 0 TO EXIT *******==================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        Showrooms showroom[] = new Showrooms[5];
        Employees employees[]= new Employees[5];
        Cars cars[] = new Cars[5];
        int car_counter =0;
        int showroom_counter =0;
        int employees_counter =0;
        int choice =100;
        while(choice!=0){
            m.main_menu();
            choice = sc.nextInt();
            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        showroom[showroom_counter]= new Showrooms();
                        showroom[showroom_counter].add_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1 >. Add new Showroom ");
                        System.out.println("9 >. Go back to main menu ");
                        choice=sc.nextInt();
                        break;
                    case 2:
                        employees[employees_counter]= new Employees();
                        employees[employees_counter].add_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2 >. Add new Employee ");
                        System.out.println("9 >. Go back to main menu ");
                        choice=sc.nextInt();
                        break;

                    case 3:
                        cars[car_counter] = new Cars();
                        cars[car_counter].add_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3 >. Add new car ");
                        System.out.println("9 >. Go back to main menu ");
                        choice=sc.nextInt();
                        break;

                    case 4:
                        for(int i=0;i<showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9 >. Go back to main menu ");
                        System.out.println("0 >. Exit");
                        choice=sc.nextInt();
                        break;

                    case 5:
                        for(int i=0;i<employees_counter;i++){
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9 >. Go back to main menu ");
                        System.out.println("0 >. Exit ");
                        choice=sc.nextInt();
                        break;

                    case 6:
                        for(int i=0;i<car_counter;i++){
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9 >. Go back to main menu ");
                        System.out.println("0 >. Exit ");
                        choice=sc.nextInt();
                        break;

                    default:
                        System.out.println("Enter Valid Choice");
                        break;
                }
            }
        }

    
    }
    
}