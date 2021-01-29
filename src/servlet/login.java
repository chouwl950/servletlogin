package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsp = "/WEB-INF/login.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(jsp);
		rd.forward(request, response);
		// TODO Auto-generated method stub
		//String email = request.getParameter("email");
		//String password = request.getParameter("password");

		//	if (email == "admin" && password == "admin") {

		//		response.sendRedirect("landing.jsp");

		//	} else {

		//response.sendRedirect("login.jsp");
		//		RequestDispatcher req = request.getRequestDispatcher("WEB-INF/login.jsp");
		//		req.include(request, response);
		//	}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String jsp = "/WEB-INF/login.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(jsp);
		rd.forward(request, response);
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email == "admin" && password == "admin") {

			RequestDispatcher req = request.getRequestDispatcher("WEB-INF/landing.jsp");
			req.include(request, response);
		}

		else {

			RequestDispatcher req = request.getRequestDispatcher("WEB-INF/login.jsp");
			req.forward(request, response);
		}

		//doGet(request, response);
	}

}
