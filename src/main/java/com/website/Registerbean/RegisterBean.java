package com.website.Registerbean;

import java.io.Serializable;

import com.website.bean.LoginBean;

import lombok.Data;

@Data
public class RegisterBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private int user_id;
	private String user_name;
	private String user_email;
	private String user_password;
	private int phone;
	private String address;
}
