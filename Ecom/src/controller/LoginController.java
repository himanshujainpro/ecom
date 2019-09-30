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

@WebServlet("/login")
public class LoginController extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		dao.CustomerDAO tempDAO=new dao.CustomerDAO();
		PrintWriter out=res.getWriter();
		try {
			if(tempDAO.verify(email,pass)) {
				HttpSession session=req.getSession();
				session.setAttribute("email", email);
				res.sendRedirect("welcome.jsp");
			}
			else{
				res.sendRedirect("login.jsp");
				out.println("Either Email or password is invalid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
