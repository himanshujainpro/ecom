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

@WebServlet("/forgetpassword")
public class ForgetPasswordController extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		String pass=null;
		String email=req.getParameter("email");
		dao.CustomerDAO tempDAO=new dao.CustomerDAO();
		
		try {
			pass=tempDAO.getPassword(email);
			if(pass==null) res.sendRedirect("forgetpassword.html");
			else out.println(" Your password is: "+pass);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
