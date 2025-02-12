import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySQLConnection{
    public static void main(String[]args){
        //database credentials 
        String url = "jdbc:mysql://localhost:3306/registration";
        String user = "root";
        String password = "";
        
        try{
            //establish connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to MySQL was successful!");
            
            connection.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}