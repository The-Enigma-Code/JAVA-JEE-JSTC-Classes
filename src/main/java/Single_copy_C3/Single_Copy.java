package Single_copy_C3;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import jakarta.servlet.http.HttpSession;

=======
>>>>>>> 430ef198fe4e7e054bccb3303ef1fc28f352ccbf
import java.io.IOException;

/**
 * Servlet implementation class Single_Copy
 */
@WebServlet("/Single_Copy")
public class Single_Copy extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
<<<<<<< HEAD
//		ServletContext sc = getServletContext();
		HttpSession hs = request.getSession();
		hs.setAttribute("sp",request.getParameter("t1"));
=======
		ServletContext sc = getServletContext();
		sc.setAttribute("sp",request.getParameter("t1"));
>>>>>>> 430ef198fe4e7e054bccb3303ef1fc28f352ccbf
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
