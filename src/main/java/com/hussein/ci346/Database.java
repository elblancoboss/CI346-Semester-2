package com.hussein.ci346;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Database {
	
	public Database() throws Exception {
		try {  
			Class.forName("com.mysql.jdbc.Driver");

			Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3300/staff","root","usbw");
			Statement dbStatement = databaseConnection.createStatement();  
			ResultSet dbResults = dbStatement.executeQuery("SELECT * FROM staff");
			
			while(dbResults.next()) {
				System.out.println(dbResults.getInt(1) + "  " + dbResults.getString(2) + "  " + dbResults.getString(3) + "  " + dbResults.getString(4));  
			}
			
			databaseConnection.close();
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public ResultSet execute(String sql) throws Exception 
	{
		try 
		{
			Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3300/staff","root","usbw");
			Statement dbStatement = databaseConnection.createStatement();  
			ResultSet dbResults = dbStatement.executeQuery(sql);

			return dbResults;
		}
		catch(Exception e) {
			throw e;
		}
		
	}
	
	public boolean update(String sql) throws Exception 
		{
			try 
			{
				Connection databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3300/staff","root","usbw");
				Statement dbStatement = databaseConnection.createStatement();  
				boolean error = dbStatement.execute(sql);
	
				return error;
			}
			catch(Exception e) {
				throw e;
			}
			
		}
}