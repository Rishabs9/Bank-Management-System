package Bank;
import java.sql.*;

public class ConnectionFactory {
	
	//Instance variable
	Connection con;
	Statement stmt;
	
	public ConnectionFactory()  //public non parameterised default constructor of Class Connectionfactory
	{
		try {
		//Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver"); //Here Class is a class 's  name , "com.cj.jdbc" is package and Driver is class
 
		//Establishing the connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement","root","Rishab@12345"); //root is user id and Rishab@12345 is password
				//jdbc:mysql is for connection of jdbc with mysql
				////localhost:3306/bankmanagement" is location for database here ,it is on local machine in mysql workbench
		
				
				stmt = con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
