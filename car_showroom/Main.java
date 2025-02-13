package car_showroom;

import java.util.Scanner;

class Showrooms implements utility{

    String showroom_name;
    String address;
    int total_employees;
    int total_car_in_stock =0;
    String manager_name;

    @Override
    public void get_default() {
        System.out.println("Showroom Name :"+showroom_name);
        System.out.println("Showroom Address :"+address);
        System.out.println("Total Employees :"+total_employees);
        System.out.println("Manger Name :"+manager_name);
        System.out.println("Total Car In Stock :"+total_car_in_stock);

    }

    @Override
    public void add_default() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================***** Enter SHOWROOM DETAILS *******==================================");
        System.out.println("Enter Showroom name :");
        showroom_name=sc.nextLine();
        System.out.println("Enter the address :");
        address=sc.next();
        System.out.println("Enter total employees :");
        total_employees=sc.nextInt();
        System.out.println("Enter total cars in stock :");
        total_car_in_stock = sc.nextInt();
        System.out.println("Enter the manager name :");
        manager_name = sc.next();
        sc.close();
    }
    
}

class Cars extends Showrooms implements utility{
    @Override
    public void add_default(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================***** Enter details *******==================================");
        System.out.println("Enter the cars to add :");
        total_car_in_stock+=sc.nextInt();
        sc.close();
    }
    @Override
    public void get_default(){
        System.out.println("===================================***** CARS details *******==================================");
        System.out.println();
        System.out.println("Total cars in stock are :"+total_car_in_stock);
    }
}

class Employees extends Showrooms implements utility{
    @Override
    public void add_default(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================***** Enter details *******==================================");
        System.out.println("Enter the employess to add :");
        total_employees+=sc.nextInt();
        sc.close();
    }
    @Override
    public void get_default(){
        System.out.println("===================================***** Employees details *******==================================");
        System.out.println();
        System.out.println("Total cars in stock are :"+total_employees);
    }
}

interface utility {

    public void get_default();

    public void add_default();
    
}

public class  Main{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===================================***** WELCOME TO THE SHOWROOM MANAGEMENT SYSTEM *******==================================");
        System.out.println();
        System.out.println("===================================***** ENTER YOUR CHOICE *******==================================");
        System.out.println();
        System.out.println("1> ADD SHOWROOM \t\t\t 2> ADD EMPLOYEES \t\t\t  3> ADD CARS ");    
        System.out.println();
        System.out.println("4> GET SHOWROOM  \t\t\t 2> GET EMPLOYEES \t\t\t  3> GET CARS ");    
        System.out.println();
        System.out.println("===================================***** ENTER 0 TO EXIT *******==================================");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1){

        }

    
    }
    
}