<%@page import="java.beans.beancontext.BeanContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.website.bean.LoginBean"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%LoginBean bean=(LoginBean)session.getAttribute("bean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>change password</title>

</head>
<body>
<div class="row wrapper">
<center>
<form action="LoginpageController?action=changepassword" method="post" >
	<center> <h1 style="color:blue;"">Update your password</h1></center>
	<% String msg=request.getParameter("done");
		if("updated".equals(msg)){
	%>
	<p style="color:green ">your password is updated successfully</p>
	<%} %>
	<%
		if("notupdated".equals(msg)){
	%>
	<p style="color:red ">your password is not updated check your old password</p>
	<%} %>
	  <input type="hidden" name="id" value="${bean.user_id}"/><br/><br/>
	  <input type="password" placeholder="enter old password " name="oldpassword"/><br/><br/>
	  <input type="password" placeholder="enter new password " name="newpassword"/><br/><br/>
	  <input type="submit"/>
	  <c:if test="${bean.user_type=='user'}">
	  <a href="home.jsp">back to home</a>
	  </c:if>
	  <c:if test="${bean.user_type=='admin'}">
	  </br>
	  </br>
	  <a href="admin.jsp">back to home</a>
	  </c:if>
</form>
</center>

</div>
</body>
</html>

