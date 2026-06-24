import java.util.*;
import java.sql.*;

public class Stud{


private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
private static final String DB_USER = "root";
private static final String DB_PASSWORD = "Yakshitha@21";

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =
        DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        System.out.println("Adding New Record");

        System.out.print("Student Id : ");
        int id = sc.nextInt();

        System.out.print("Student Name : ");
        String name = sc.next();

        System.out.print("Branch : ");
        String branch = sc.next();

        System.out.print("Year : ");
        int year = sc.nextInt();

        System.out.print("Email : ");
        String email = sc.next();

        System.out.print("CGPA : ");
        double cgpa = sc.nextDouble();

        PreparedStatement pstmt = con.prepareStatement(
        "INSERT INTO student(id,name,branch,year,email,cgpa) VALUES(?,?,?,?,?,?)");

        pstmt.setInt(1,id);
        pstmt.setString(2,name);
        pstmt.setString(3,branch);
        pstmt.setInt(4,year);
        pstmt.setString(5,email);
        pstmt.setDouble(6,cgpa);

        pstmt.executeUpdate();

        System.out.println("\nStudent Added Successfully");

        Statement s = con.createStatement();

        ResultSet rs =
        s.executeQuery("SELECT * FROM student");

        System.out.println("\nAll Students");

        while(rs.next()) {

            System.out.println(
            rs.getInt("id")+" "+
            rs.getString("name")+" "+
            rs.getString("branch")+" "+
            rs.getInt("year")+" "+
            rs.getString("email")+" "+
            rs.getDouble("cgpa"));
        }

        rs.close();
        s.close();

        System.out.println("\nUpdate Record");

        System.out.print("Enter Student Id : ");
        int uid = sc.nextInt();

        System.out.print("Enter New Year : ");
        int newYear = sc.nextInt();

        System.out.print("Enter New CGPA : ");
        double newCgpa = sc.nextDouble();

        PreparedStatement ups =
        con.prepareStatement(
        "UPDATE student SET year=?, cgpa=? WHERE id=?");

        ups.setInt(1,newYear);
        ups.setDouble(2,newCgpa);
        ups.setInt(3,uid);

        ups.executeUpdate();

        System.out.println("Record Updated");

        System.out.println("\nDelete Record");

        System.out.print("Enter Student Id : ");
        int did = sc.nextInt();

        PreparedStatement del =
        con.prepareStatement(
        "DELETE FROM student WHERE id=?");

        del.setInt(1,did);

        del.executeUpdate();

        System.out.println("Record Deleted");

        System.out.println("\nSearch Student");

        System.out.print("Enter Student Id : ");
        int searchId = sc.nextInt();

        System.out.print("Enter Student Name : ");
        String searchName = sc.next();

        PreparedStatement searchStmt =
        con.prepareStatement(
        "SELECT * FROM student WHERE id=? AND name=?");

        searchStmt.setInt(1,searchId);
        searchStmt.setString(2,searchName);

        ResultSet rsSearch =
        searchStmt.executeQuery();

        while(rsSearch.next()) {

            System.out.println(
            rsSearch.getInt("id")+" "+
            rsSearch.getString("name")+" "+
            rsSearch.getString("branch")+" "+
            rsSearch.getInt("year")+" "+
            rsSearch.getString("email")+" "+
            rsSearch.getDouble("cgpa"));
        }

        rsSearch.close();
        searchStmt.close();

        System.out.println("\nTop 5 Students");

        Statement topStmt =
        con.createStatement();

        ResultSet rsTop =
        topStmt.executeQuery(
        "SELECT * FROM student ORDER BY cgpa DESC LIMIT 5");

        while(rsTop.next()) {

            System.out.println(
            rsTop.getDouble("cgpa")+" | "+
            rsTop.getInt("id")+" | "+
            rsTop.getString("name"));
        }

        rsTop.close();
        topStmt.close();

        System.out.println("\nBranch Report");

        System.out.print("Enter Branch : ");
        String repBranch = sc.next();

        PreparedStatement reportStmt =
        con.prepareStatement(
        "SELECT * FROM student WHERE branch=?");

        reportStmt.setString(1,repBranch);

        ResultSet rsReport =
        reportStmt.executeQuery();

        while(rsReport.next()) {

            System.out.println(
            rsReport.getInt("id")+" "+
            rsReport.getString("name")+" "+
            rsReport.getString("email")+" "+
            rsReport.getDouble("cgpa"));
        }

        rsReport.close();
        reportStmt.close();

        con.close();

    }
    catch(Exception e) {
        e.printStackTrace();
    }

    sc.close();
}


}