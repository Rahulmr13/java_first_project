package com.learning.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.tomcat.jdbc.pool.DataSourceProxy;

public class DBConfig {
	
	private static Connection con=null;
	static{
		try {
			InitialContext initialContext=new InitialContext();
			Context context=(Context)initialContext.lookup("java:comp/env");
			DataSource ds=(DataSource)context.lookup("jdbc/login");
			con=ds.getConnection();
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection(){
		return con;
	}
	
	
	public  static void closeConnection() {
        try {
            // Look up the DataSource using JNDI
            InitialContext initialContext = new InitialContext();
            DataSource dataSource = (DataSource) initialContext.lookup("java:comp/env/jdbc/login");
            if (dataSource instanceof DataSourceProxy ) {
                ((DataSourceProxy) dataSource).close();
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

}
