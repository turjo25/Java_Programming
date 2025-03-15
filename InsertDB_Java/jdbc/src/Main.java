import java.sql.*;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/test";
        String user = "";
        String password = "";
        String query = "select Name from student_details where Roll=101";
        try {
            Class.forName("com.mysql.jdbc.diver");
            //System.out.println("Connecting to database...");
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Connected!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("Name");
                System.out.println(name);
            }
            rs.close();
            stmt.close();
            con.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }
    }