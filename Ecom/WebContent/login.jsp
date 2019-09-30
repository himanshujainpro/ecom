<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
<style>
tabel,th,td{
border:solid blue;
border-collapse: collapse;
}
</style>
</head>

<body>
	<table align="center">
	
	<tr>
		<th colspan="2"><b>Login</b></th>
	</tr>
	
		<form action="login" method="POST">
		
		<tr><td><input type="email" name="email" placeholder="Email" required></tr></td>

		<tr><td><input type="text" placeholder="Password" name="pass"></tr></td>

		<tr><td><button type="submit")>Login</button></td></tr>
			
		<tr><td><a href="register.html">Sign Up</a></button></td></tr>	
			
		<tr><td><a href="forgetpassword.html">Forget Password</a></button></td></tr>
			
		</form>
		
	</table>
	<p align="center">if you are redirecting to same page after login, that means data is not valid.</p>
	<p align="center">Practice Project By Himanshu.</p>
	<p align="center" style="color:red">IN Progress.</p>
</body>
</html>