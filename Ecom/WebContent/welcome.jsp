<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Welcome to the LoginLogoutDemo</p>
	<%
		
		response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
		
		if(session.getAttribute("email")==null){
			System.out.println("You are not logged in please login first");
			response.sendRedirect("login.jsp");
		}
		else{
			out.println("Login Sucessful");
		}
	%>
	
	<a href="videos.jsp">My Coding Practices</a>
	
	<form action="logout">
		<input type="submit" value="logout"/>
	</form>
	<p align="center">Practice Project By Himanshu.</p>
	<p align="center" style="color:red">IN Progress.</p>
</body>
</html>