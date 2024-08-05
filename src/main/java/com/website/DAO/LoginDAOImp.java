package com.website.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.learning.utils.DBConfig;
import com.website.bean.LoginBean;

public class LoginDAOImp implements LoginDAO {
	private static final String LOGIN_USER_STRING = "select * from user where user_email=? and user_password=?";
	private static final String CHANGE_PASSWORD_USER_STRING = "update user set user_password=? where user_id=? and user_email=?";
	private static final String REGISTER_USER_STRING = "insert into user(user_name,user_email,user_password,phone,address) values(?,?,?,?,?)";
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
    public LoginDAOImp() {
		
		con=DBConfig.getConnection();
	}
	@Override
	public LoginBean userLogin(String username, String userpassword) throws Exception {
		ps=con.prepareStatement(LOGIN_USER_STRING);
		ps.setString(1, username);
		ps.setString(2, userpassword);
		rs=ps.executeQuery();
		while(rs.next())
		{
			LoginBean bean= new LoginBean();
			bean.setUser_id(rs.getInt("user_id"));
			bean.setUser_name(rs.getString("user_name"));
			bean.setUser_email(rs.getString("user_email"));
			bean.setUser_password(rs.getString("user_password"));
			bean.setPhone(rs.getString("phone"));
			bean.setAddress(rs.getString("address"));
			return bean;
		}
		return null;
	}

	@Override
	public int changepassword(String oldpassword, String newpassword, int userid) throws Exception {
		// TODO Auto-generated method stub
		int count=0;
		try {
			ps=con.prepareStatement(CHANGE_PASSWORD_USER_STRING);
			ps.setString(1,oldpassword);
			ps.setString(2,newpassword);
			ps.setLong(3,userid);
			count=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public int Registeruser(LoginBean bean) throws Exception{
		ps=con.prepareStatement(REGISTER_USER_STRING);
		ps.setString(1, bean.getUser_name());
		ps.setString(2, bean.getUser_email());
		ps.setString(3, bean.getUser_password());
		ps.setString(4, bean.getPhone());
		ps.setString(5,bean.getAddress());
		
		return ps.executeUpdate();
		
	}

}
