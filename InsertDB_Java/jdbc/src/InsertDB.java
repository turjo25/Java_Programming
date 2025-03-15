import java.sql.*;
public class InsertDB {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/test";
        String user = "";
        String password = "";
        String query = "INSERT INTO Student_details (Roll, Name, Gender, Age) VALUES\n" +
                "(101, 'Rahim', 'Male', 18),\n";
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
            stmt.executeUpdate(query);//for execution of the insertion query(works also for deletion and update query)
            rs.close();
            stmt.close();
            con.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
