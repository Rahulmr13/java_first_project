package com.website.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class AdminBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private int product_id;
	private String product_name;
	private String product_categeries;
	private int product_price;
	
}
