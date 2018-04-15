import java.sql.*;+

class Ash{  
public static void main(String args[]){  
	String i="y";
	String j="world";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	//step2 create  the connection object
		
	Connection connection=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","ashwin");
	Statement stt=connection.createStatement();
	//String query=insert into REGIS values(?,?,?,?,?,?);
	PreparedStatement stmt=connection.prepareStatement("insert into example values(?,)");
	//stmt.executeQuery("insert into REGIS values(?,?,?,?,?,?)");
stmt.setString(1,i );
//stmt.setString(2, j);

	stmt.execute();
	
	
	
	connection.close();

   
}catch(Exception e){ System.out.println(e);}  
  
}  
}  

