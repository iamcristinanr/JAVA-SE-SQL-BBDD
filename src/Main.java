import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)  throws SQLException {
          Connection myConn = null;
          PreparedStatement myStamt = null;

        try{
            myConn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project", "root", "");
            System.out.println("Genial, nos conectamos");

            String sql = ("INSERT INTO employees (first_name) VALUES (?)");

            myStamt = myConn.prepareStatement(sql);
            myStamt.setString(1, "Cristina");

            int rowsAffected = myStamt.executeUpdate();

            if (rowsAffected>0){
                System.out.println("Se ha creado un nuevo cliente");
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Algo salió mal :(");
        }
        }
    }
