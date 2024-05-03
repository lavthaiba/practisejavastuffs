package classesconcept;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ClassA{
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		
	String host = "jdbc:mysql://localhost:3306/";
	String username ="root";
	String password = "root";
	String dbName = "qasession";
	String dbURL = host + dbName; 
	String dbDriver = "com.mysql.jdbc.Driver";
	
	
	Class.forName(dbDriver).newInstance();
//	Class.forName(dbDriver).getDeclaredConstructor().newInstance();
	
	//conection
	Connection connection = DriverManager.getConnection(dbURL, username, password);
	if(!connection.isClosed()) {
		
		System.out.println("database is successfully connected!");
	}
	
	//execute query
	
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from participants");
	
	while(resultSet.next()) {
		
		System.out.println("The participants name are: "+resultSet.getString("name"));
	}
	
		connection.close();
		
	if(connection.isClosed()) {
		System.out.println("Connection with database is closed!");
	}
		
	}
}
