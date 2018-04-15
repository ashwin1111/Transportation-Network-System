import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class g{  
public static void main(String args[]){  
	String i="hey";
	String j="world";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	//step2 create  the connection object
		
	Connection connection=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
	Statement stt=connection.createStatement();
	//String query=insert into REGIS values(?,?,?,?,?,?);
	PreparedStatement stmt=connection.prepareStatement("insert into example values(?,?)");
	//stmt.executeQuery("insert into REGIS values(?,?,?,?,?,?)");
stmt.setString(1,i );
stmt.setString(2, j);

	stmt.execute();
	
	
	
	connection.close();

   
}catch(Exception e){ System.out.println(e);}  
  
}  
}  

