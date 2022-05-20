package com.apps.db;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.zkoss.zul.Messagebox;

public class DBSQLConnection {
	 public Connection openConnection(){
	        Connection Conn = null;
	        try {

	            Context initContext = new InitialContext();
	            Context envContext  = (Context)initContext.lookup("java:/comp/env");
	            DataSource ds = (DataSource)envContext.lookup("jdbc/apps");
	            Conn = ds.getConnection();
	            
	        }catch (Exception e) {
	            System.out.println("Error : " + e.getMessage());
	            Messagebox.show("Connection Failed..: "+e.getMessage());
	        }
	        return Conn;
	    }

}
