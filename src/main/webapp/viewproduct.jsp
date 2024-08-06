<%@page import="java.beans.beancontext.BeanContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.website.bean.LoginBean"%>
<% 
	if(session.getAttribute("bean")== null){
	response.sendRedirect("login.jsp");
}%>
    

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" rel="rel">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <title>Home Page</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
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

<body class="index-page">

  <header id="header" class="header d-flex align-items-center fixed-top">
    <div class="container-fluid container-xl position-relative d-flex align-items-center">

      <a href="home.jsp" class="logo d-flex align-items-center me-auto">
        <img src="assets/img/logo.png" alt="">
        <h1 class="sitename">QuickStart</h1>
      </a>

      <nav id="navmenu" class="navmenu">
        <ul>
          <li><a href="home.jsp" >Home</a></li>
          <li><a href="viewproduct.jsp" class="active">Products gallery</a></li>
          <li><a href="#!">Photo gallery</a></li>
          <li><a href="#!">About Hotel</a></li>
          <li><a href="#!">Address</a></li>
          <li><a href="#!">Contact us</a></li>
        </ul>
        <i class="mobile-nav-toggle d-xl-none bi bi-list"></i>
      </nav>

      <a class="btn-getstarted" href="LoginpageController?action=logout">Logout</a>
      <%LoginBean bean=(LoginBean)session.getAttribute("bean");%>
      <a class="btn-getstarted" href="#!">${bean.user_name}</a>

    </div>
  </header>

  <main class="main">

    <!-- Hero Section -->
  </main>
 -->
  <!-- Scroll Top -->
  <a href="#" id="scroll-top" class="scroll-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Preloader -->
  <div id="preloader"></div>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

  <!-- Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>