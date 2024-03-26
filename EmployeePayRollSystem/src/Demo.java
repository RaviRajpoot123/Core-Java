import java.sql.*;
import java.util.Scanner;

// java Database connectivity // driver =

public class Demo {



    public static void main(String[] args) {

        insertData();
        getData();

    }
/*Connecting Java Database connectivity Drivers in java*/
    public static Connection getConnection(){

        try{

            String driver = "com.mysql.cj.jdbc.Driver";

            String url = "jdbc:mysql://localhost:3306/company";

            String username = "root";

            String password = "localHost220*";

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(url,username,password);

            System.out.println("Database connected! ready to go!");

            return connection;

        }

        catch (Exception e) {

            System.out.println("Some Error " + e);

        }

     return null;
    }

    public static void getData(){
        try {

            Statement statement = getConnection().createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM empl");

            while (resultSet.next()){
                System.out.println(resultSet.getString("id")+" " +resultSet.getString("name"));
            }
        }

        catch (Exception e){
            System.out.println("Some error  "+e);
        }
    }

    public static void insertData(){
        Scanner mm = new Scanner(System.in);


            try{

                Statement statement = getConnection().createStatement();
               int id = 36;
               String name = "lokeshwar";

               int result = statement.executeUpdate("insert into empl (id,name) values(?,?);");

                PreparedStatement preparedStatement = c
                if (result == 1) {
                    System.out.println("Data Inserted");
                }
            }
                catch (Exception e) {

                System.out.println("Error Found :" + e);
                }
    }

}