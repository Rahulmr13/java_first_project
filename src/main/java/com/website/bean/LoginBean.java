package com.website.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int user_id;
	private String user_name;
	private String user_email;
	private String user_password;
	private String phone;
	private String address;

}
