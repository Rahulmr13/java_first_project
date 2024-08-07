<%@page import="com.website.bean.LoginBean"%>
<%@page import="java.beans.beancontext.BeanContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
<link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Fonts -->
  <link href="https://fonts.googleapis.com" rel="preconnect">
  <link href="https://fonts.gstatic.com" rel="preconnect" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&family=Inter:wght@100;200;300;400;500;600;700;800;900&family=Nunito:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Main CSS File -->
  <link href="assets/css/main.css" rel="stylesheet">

</head>
<body>

<header id="header" class="header d-flex align-items-center fixed-top">
    <div class="container-fluid container-xl position-relative d-flex align-items-center">

      <a href="home.jsp" class="logo d-flex align-items-center me-auto">
        <img src="assets/img/logo.png" alt="">
        <h1 class="sitename">QuickShop</h1>
      </a>

      <nav id="navmenu" class="navmenu">
        <ul>
        <c:if test="${bean.user_type=='user'}">
        <li><a href="home.jsp" class="active">Home</a></li>
          		<li><a href="viewproduct.jsp">product gallery</a></li>
          		<li><a href="#!">Photo gallery</a></li>
          		<li><a href="#!">About Hotel</a></li>
          		<li><a href="#!">Address</a></li>
          		<li><a href="#!">contact us</a></li>
        </c:if>
         <c:if test="${bean.user_type=='admin'}">
          <li><a href="admin.jsp" >DashBoard</a></li>
          <li><a href="#!" class="active"></a></li>
          <li class="dropdown"><a href="#"><span>items</span> <i class="bi bi-chevron-down toggle-dropdown"></i></a>
            <ul>
              <li><a href="admin.jsp" class="active">Add items</a></li>
              <li><a href="viewproduct.jsp">view product</a></li>
              <li><a href="viewregisteruser.jsp">Registered user</a></li>
            </ul>
          </li>
          </c:if>
        </ul>
        <i class="mobile-nav-toggle d-xl-none bi bi-list"></i>
      </nav>
	  <a class="btn-getstarted" href="changepassword.jsp">Change password</a>
      <a class="btn-getstarted" href="LoginpageController?action=logout">Logout</a>
      <%LoginBean bean=(LoginBean)session.getAttribute("bean"); %>
      <a class="btn-getstarted" href="#!">${bean.user_name}</a>

    </div>
  </header>


</body>
</html>