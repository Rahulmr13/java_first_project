package com.website.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.DAO.AdminADAOImp;
import com.website.DAO.AdminDAO;
import com.website.bean.AdminBean;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String action= request.getParameter("action");
		try {
			AdminDAO dao=new AdminADAOImp();
			if(action.equals("additems")) {
			AdminBean bean= new AdminBean();
			bean.setProduct_name(request.getParameter("product_name"));
			bean.setProduct_categeries(request.getParameter("product_categeries"));
			bean.setProduct_price(Integer.parseInt(request.getParameter("product_price"))) ;
			int count=dao.additems(bean);
			 if(count>0) {
				 response.sendRedirect("admin.jsp?valid=success");
			 }
			 else {
				 response.sendRedirect("admin.jsp");
			 }
			
			}
			
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		
	}

}
