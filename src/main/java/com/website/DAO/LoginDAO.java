package com.website.DAO;

import com.website.bean.LoginBean;

public interface LoginDAO {
	public LoginBean userLogin(String username,String userpassword) throws Exception;
	public int changepassword(String oldpassword,String newpassword,int userid) throws Exception;
	public int Registeruser(LoginBean bean) throws Exception;
}
