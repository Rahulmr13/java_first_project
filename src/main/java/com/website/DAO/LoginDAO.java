package com.website.DAO;

import com.website.bean.LoginBean;

public interface LoginDAO {
	public LoginBean userLogin(String username,String userpassword) throws Exception;
	public int changepassword(int id,String oldpassword,String newpassword) throws Exception;
	public int Registeruser(LoginBean bean) throws Exception;
}
