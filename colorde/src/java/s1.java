

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String h1=request.getParameter("email");
		String h2=request.getParameter("password");
		String h3=request.getParameter("add1");
		String h4=request.getParameter("add2");
		String h5=request.getParameter("city");
		String h6=request.getParameter("state");
		String h7=request.getParameter("zip");
		String c1=request.getParameter("rb1");
		String c2=request.getParameter("gb1");
		String c3=request.getParameter("bb1");
		String c5=request.getParameter("yb1");
//		/ServletContext con=getServletContext();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://root@localhost/de","root","root");
		Statement st=c.createStatement();
		st.executeUpdate("insert into color(Email,Password,Address1,Address2,City,State,Zip,Red,Green,Blue,Yellow) values('"+h1+"','"+h2+"','"+h3+"','"+h4+"','"+h5+"','"+h6+"','"+h7+"','"+c1+"','"+c2+"','"+c3+"','"+c5+"')");
		
		}
		catch(Exception e)
		{e.getMessage();
		}
		//con.setAttribute("p1", c1);
		//con.setAttribute("p2", c2);
		//con.setAttribute("p3", c3);
		//con.setAttribute("p4", c4);
		response.sendRedirect("login");
		    
	}

}
