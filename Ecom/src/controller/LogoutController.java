package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		session.removeAttribute("email");
		session.removeAttribute("pass");
		res.sendRedirect("login.jsp");
	}
}
