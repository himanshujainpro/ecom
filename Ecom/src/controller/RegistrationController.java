package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class RegistrationController extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		model.CustomerData tempCustomer=new model.CustomerData();
		
		tempCustomer.firstName=req.getParameter("first_name");
		tempCustomer.lastName=req.getParameter("last_name");
		tempCustomer.email=req.getParameter("email");
		tempCustomer.mobile=Integer.parseInt(req.getParameter("mo_no"));
		tempCustomer.password=req.getParameter("password");
		
		dao.CustomerDAO tempDAO=new dao.CustomerDAO();
		
		try {
			int result=tempDAO.registerCustomer(tempCustomer);
			if(result==1) {
				out.println("Registration Sucessful Please login");
				res.sendRedirect("login.jsp");
			}
			else {
				out.println("Error Occured");
				res.sendRedirect("register.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
