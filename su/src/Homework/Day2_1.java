package Homework;

import java.sql.*;
public class Day2_1 {
public static void main(String args[]) {
  try{  Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
  }
  catch(Exception e) {
  }
  Connection con;
  Statement sql; 
  ResultSet rs;
  try { 
    String uri="jdbc:derby:dog;create=true"; 
    con=DriverManager.getConnection(uri);
    sql=con.createStatement();
    rs=sql.executeQuery("select name,price from mess");
    while(rs.next()) {  //输出结果集中的记录，即行
        String name=rs.getString(1);
        double price=rs.getDouble("price");
        System.out.print(name+"|");
        System.out.println(price+"|");
    }
    con.close();
  }
  catch(SQLException e) { System.out.println(e);
  }
}    
}
