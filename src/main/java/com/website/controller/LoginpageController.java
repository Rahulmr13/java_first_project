package com.website.controller;

import java.io.IOException;
import java.io.ObjectInputFilter.Status;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression;

import com.website.DAO.LoginDAO;
import com.website.DAO.LoginDAOImp;
import com.website.bean.LoginBean;

@WebServlet("/LoginpageController")
public class LoginpageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
	HttpSession session=request.getSession();
	String action=request.getParameter("action");
	try {
		if(action.equals("login"))
		{
			LoginDAO dao= new LoginDAOImp();
			String username=request.getParameter("email");
			String userpssword=request.getParameter("password");
			LoginBean bean=(LoginBean)dao.userLogin(username, userpssword);
			if(bean!=null)
			{
				session.setAttribute("bean", bean);
				response.sendRedirect("home.jsp");
			}
			else {
				session.setAttribute("failed","invalid credentials");
				response.sendRedirect("login.jsp");
			}
			
			
		}
		else if(action.equals("register")) {
			LoginBean bean = new LoginBean();
			LoginDAO dao = new LoginDAOImp();
			bean.setUser_name(request.getParameter("name"));
			bean.setUser_email(request.getParameter("email"));
			bean.setPhone(request.getParameter("phone"));
			bean.setAddress(request.getParameter("address"));
			bean.setUser_password(request.getParameter("password"));
			int status = dao.Registeruser(bean);
			if(status>0)
			{
				response.sendRedirect("login.jsp");
			}
			else {
				session.setAttribute("status","enter proper details");
				response.sendRedirect("registartion.jsp");
			}
			
			
		}
		else if(action.equals("logout")) {
			session.invalidate();
			System.gc();			
			response.sendRedirect("login.jsp");
		
	}
			
	}
	catch(Exception e) {
		e.printStackTrace();	
		}

	}
	}
