import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

class MySQLConnectionExample {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/college";
            String username = "root";
            String password = "localHost220*";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Perform database operations here

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


abstract class Employee{
    private String name;
    private int id;
    public Employee(String name , int id){
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public abstract double CalculateSal();

    @Override
    public String toString(){
        return "Employee  [name = "+name+", id = "+id+",salary = "+CalculateSal()+"]";
    }
}
class fullTimeEmployee extends Employee{
    private double monthlySal;
    public fullTimeEmployee(String name, int id, double monthlySal){
        super(name, id);
        this.monthlySal = monthlySal;
    }
    @Override
    public double CalculateSal(){
        return monthlySal;
    }
}
class partTimeEmployee extends Employee{
    private double hoursWork;
    private double hourRate;
    public partTimeEmployee(String name , int id , double hoursWork, double hourRate){
        super(name, id);
        this.hoursWork = hoursWork;
        this.hourRate = hourRate;
    }
    @Override
    public double CalculateSal(){
        return hourRate * hoursWork;
    }
}

class Payrollsystem{
    private ArrayList <Employee> employeeList ;
    public Payrollsystem(){
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void RemoveEmployee(int id){
        Employee employeeRemove = null ;
        for( Employee employee : employeeList){
            if (employee.getId() == id){
                employeeRemove = employee;
                break;
            }
        }
        if (employeeRemove != null){
            employeeList.remove(employeeRemove);
        }
    }
    public void displayEmployee(){
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        double Salary,SalaryHour,WorkHour;
        Payrollsystem obj = new Payrollsystem();
        Scanner mm = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. view 2. add 3.remove");
        int choice = mm.nextInt();
        switch (choice){
            case 1 :
            {
                obj.displayEmployee();
                break;
            }
            case 2 :
            {
                System.out.println("1.FullTime Employee 2.Part-time Employee");
                choice = mm.nextInt();
                switch (choice){
                    case 1:{
                        System.out.println("Enter name of the employee");
                        name = mm.next();
                        System.out.println("Enter Id of the employee");
                        id = mm.nextInt();
                        System.out.println("Enter Salary of the employee");
                        Salary = mm.nextDouble();
                        fullTimeEmployee emp = new fullTimeEmployee(name,id,Salary);
                        break;
                    }
                    case 2:{
                        System.out.println("Enter name of the employee");
                        name = mm.nextLine();
                        System.out.println("Enter Id of the employee");
                        id = mm.nextInt();
                        System.out.println("Enter Salary/Hour of the employee");
                        SalaryHour = mm.nextDouble();
                        System.out.println("Enter WorkHour of the employee");
                        WorkHour = mm.nextDouble();

                        partTimeEmployee emp = new partTimeEmployee(name,id,WorkHour,SalaryHour);
                        break;

                    }
                }
                break;
            } case 3 :
            {
                System.out.println("Enter the id number to remove the employee");
                id = mm.nextInt();
                obj.RemoveEmployee(id);
                break;
            }
            default: {
                System.out.println("wrong input");
            }
        }

       /* fullTimeEmployee emp1 = new fullTimeEmployee("vikas",1,6000);
        partTimeEmployee emp2 = new partTimeEmployee("hori", 2 , 800 ,6);

        obj.addEmployee(emp1);
        obj.addEmployee(emp2);

        System.out.println("Initial data of employees");
        obj.displayEmployee();

        obj.RemoveEmployee(2);

        System.out.println("Updated Data ");
        obj.displayEmployee();*/


    }
}
