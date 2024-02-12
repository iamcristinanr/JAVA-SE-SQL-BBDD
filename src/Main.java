import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          Connection myConn = null;
          Statement myStamt = null;
          ResultSet myRes = null;

        try{
            myConn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "");
            System.out.println("Genial, nos conectamos");

            myStamt = myConn.createStatement();
            myRes = myStamt.executeQuery("SELECT * FROM Employees");

            while(myRes.next()){
                System.out.println(myRes.getString("first_name"));
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Algo salio mal :(");
        }
        }
    }
