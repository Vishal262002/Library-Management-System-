//
//package Project;
//import java.sql.*;
//
//public class ConnectionProvider {
//
//    public static Connection getCon() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    Connection con;
//    Statement st;
//    public ConnectionProvider(){
//        try
//        {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","cobra","Cobra420@");
//            st = con.createStatement();
//            if(con.isClosed()){
//                System.out.print("Not-Connect");
//            }
//            else
//            {
//                System.out.print("Connect");
//            }
//        }
//        catch(Exception e)
//        {
//            
//            e.printStackTrace();
//        }
//    }
//    public static void main(String[] args){
//        new ConnectionProvider();
//    }
//}
//    





package Project;
import java.sql.*;

public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","cobra","Cobra420@");
            return con;
        }
        catch(Exception e)
        {
            
            System.out.println(e);
            return null;
        }
    }
}
   
