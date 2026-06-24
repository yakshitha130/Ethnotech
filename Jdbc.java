
import java.sql.*;

public class Jdbc {

   public static void main(String[] args) {

       try {
//load driver
           Class.forName("com.mysql.cj.jdbc.Driver");
//create connetion
           Connection con =
           DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/Ecommerces",
           "root",
           "Yakshitha@21");
//statement 
           Statement stmt =
           con.createStatement();
//result set or execute query
          ResultSet rs =
           stmt.executeQuery(
           "select * from products");
//process result set
           while(rs.next()) {

               System.out.println(
               rs.getInt("product_id")+" "+
               rs.getString("product_name")+" "+
               rs.getDouble("product_price")+" ");
           }
//close connection
           rs.close();
           stmt.close();
           con.close();

       }
       catch(Exception e) {
           e.printStackTrace();
       }
   }
}