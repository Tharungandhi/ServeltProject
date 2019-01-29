package com.bridgelabz.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

import com.bridgelabz.model.UserInformation;
import com.bridgelabz.servlet.RegistrationPage;
  
public class UserDataBase {
	  
	 public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
	     String hostName = "localhost";
	     String dbName = "ServletProject";
	     String userName = "root";
	     String password = "password";
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	  
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	    
	     Class.forName("com.mysql.jdbc.Driver");
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
	 
	 
	 public static void registration(UserInformation user) throws SQLException, ClassNotFoundException
	 {
		 String query = " insert into  USERINFORMATION values (?,?,?, ?, ?,?,?)";
         Connection conn=getMySQLConnection();
         PreparedStatement preparedStmt = conn.prepareStatement(query);
         preparedStmt.setInt(1,0);
         preparedStmt.setString(2, user.getFirstname());
         preparedStmt.setString(3, user.getLastName());
         preparedStmt.setString(4, user.getEmailId());
         preparedStmt.setString(5, user.getPassword());
         preparedStmt.setString(6, user.getMobileNo());
         preparedStmt.setString(7, user.getGender());
         preparedStmt.execute();
         conn.close();
     }
	
	 public static UserInformation reteriew(UserInformation user) throws ClassNotFoundException, SQLException
	 {
		 UserInformation userinform=null; 
		 String sql = "SELECT * FROM USERINFORMATION Where email_id=? && password=?";
		 Connection conn=getMySQLConnection();
		 PreparedStatement preparedStmt = conn.prepareStatement(sql);
		 preparedStmt.setString(1, user.getEmailId());
		 preparedStmt.setString(2, user.getPassword());
    	 ResultSet rset = preparedStmt.executeQuery();
		 while(rset.next()){
			 userinform=new UserInformation();
			 userinform.setFirstname(rset.getString(2));	
			 userinform.setLastName(rset.getString(3));
			 userinform.setEmailId(rset.getString(4));
			 userinform.setPassword(rset.getString(5));
			 userinform.setMobileNo(rset.getString(6));
			 userinform.setGender(rset.getString(7));
			 }
		      rset.close();
	          preparedStmt.close();
	          conn.close();
	          return userinform;
	 }
	
	 
	 public static void edit( UserInformation  userinform) throws SQLException, ClassNotFoundException
	 {   
		 String sql1="update USERINFORMATION set firstname=?,lastname=?,password=?,phoneno=?,gender=? where email_id=?";
		 Connection conn=getMySQLConnection();
		 PreparedStatement updateUserInfo = (PreparedStatement) conn.prepareStatement(sql1);
//		 ResultSet rs=updateUserInfo.executeQuery();
//		 while(rs.next())
//		 {
         updateUserInfo.setString(1, userinform.getFirstname());
         updateUserInfo.setString(2, userinform.getLastName());
         updateUserInfo.setString(3, userinform.getPassword());
         updateUserInfo.setString(4, userinform.getMobileNo());
         updateUserInfo.setString(5, userinform.getGender());
         updateUserInfo.setString(6,  userinform.getEmailId());
         updateUserInfo.executeUpdate();
//	 }
//		 rs.close();
		 updateUserInfo.close();
	     conn.close();
//	     return updateUserInfo;
	 
	 }
	 

}
	 

