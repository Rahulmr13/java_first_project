package com.website.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learning.utils.DBConfig;
import com.website.bean.AdminBean;
import com.website.bean.LoginBean;

public class AdminADAOImp implements AdminDAO {
	private static final String ADD_ITEMS_STRING ="insert into items values(?,?,?,?);";
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	public AdminADAOImp()
	{
		con=DBConfig.getConnection();
	}
	public int additems(AdminBean bean) throws SQLException {
		
			pst=con.prepareStatement(ADD_ITEMS_STRING);
			pst.setLong(1,bean.getProduct_id());
			pst.setString(2,bean.getProduct_name() );
			pst.setString(3, bean.getProduct_categeries());
			pst.setLong(4,bean.getProduct_price());
			return pst.executeUpdate();				
		
	}
}
