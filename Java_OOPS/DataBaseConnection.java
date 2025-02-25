import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class DataBaseConnection {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Shopping", "root", "dhanush$@2456");
        System.out.println("Connection Established !!");
        Statement st=connection.createStatement();

        String query="SELECT * from customer";

        ResultSet rs=st.executeQuery(query);

        System.out.println("Query executed.");

        while(rs.next()){
            int ID=rs.getInt("customer_id");
            String name=rs.getString("customer_name");
            String contact=rs.getString("phone_number");
            System.out.println("customer id : "+ ID+" customer name : "+ name+ " customer contact : "+ contact);
        }

        st.close();
        connection.close();
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
