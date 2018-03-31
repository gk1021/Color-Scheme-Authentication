

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class S2
 */
@WebServlet("/S2")
public class s2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext con=getServletContext();
		String s5=request.getParameter("email");
		String s6=request.getParameter("ps");
		 String s1=request.getParameter("bb1");
         String s2=request.getParameter("bb2");
         String s3=request.getParameter("bb3");
         String s4=request.getParameter("bb4");
	String p1=null;	
        String p2=null;
        String p3=null;
        String p4=null;
         try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select Email,Password,Red,Green,Blue,Yellow from color");	
			while(rs.next())
			{
				String x5=rs.getString("Email");
				String x6=rs.getString("Password");
				if(s5.equals(x5) && s6.equals(x6))
                                {
                                p1=rs.getString("Red");
				 p2=rs.getString("Green");
				 p3=rs.getString("Blue");
				 p4=rs.getString("Yellow");
                                }
			/*	if(s1.equals(x1) && s2.equals(x2) && s3.equals(x3) && s4.equals(x4))
				{
					
					con.setAttribute("p1", x1);
					con.setAttribute("p2", x2);
					con.setAttribute("p3", x3);
					con.setAttribute("p4", x4);
				}
				else
				{
					
				}
*/
			}
                }
		
		catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		/*String p1=(String) con.getAttribute("p1");
        String p2=(String) con.getAttribute("p2");
		String p3=(String) con.getAttribute("p3");
		String p4=(String) con.getAttribute("p4");*/
		int c1=Integer.parseInt((String) con.getAttribute("c1"));
		int c2=Integer.parseInt((String) con.getAttribute("c2"));
                int c3=Integer.parseInt((String) con.getAttribute("c3"));
                int c4=Integer.parseInt((String) con.getAttribute("c4"));
               
                int f=1;
               
	                switch(c1)
	                {
	                        case 1:
	                            if(!s1.equals(p1))
	                                f=0;
	                            break;
	                        case 2:
	                            if(!s1.equals(p2))
	                                f=0;
	                            break;
	                        case 3:
	                            if(!s1.equals(p3))
	                                f=0;
	                            break;
	                        case 4:
	                            if(!s1.equals(p4))
	                                f=0;
	                            break;
	                }
	                switch(c2)
	                {
	                        case 1:
	                            if(!s2.equals(p1))
	                                f=0;
	                            break;
	                        case 2:
	                            if(!s2.equals(p2))
	                                f=0;
	                            break;
	                        case 3:
	                            if(!s2.equals(p3))
	                                f=0;
	                            break;
	                        case 4:
	                            if(!s2.equals(p4))
	                                f=0;
	                            break;
	                }
	                switch(c3)
	                {
	                        case 1:
	                            if(!s3.equals(p1))
	                                f=0;
	                            break;
	                        case 2:
	                            if(!s3.equals(p2))
	                                f=0;
	                            break;
	                        case 3:
	                            if(!s3.equals(p3))
	                                f=0;
	                            break;
	                        case 4:
	                            if(!s3.equals(p4))
	                                f=0;
	                            break;
	                }
	                switch(c4)
	                {
	                        case 1:
	                            if(!s4.equals(p1))
	                                f=0;
	                            break;
	                        case 2:
	                            if(!s4.equals(p2))
	                                f=0;
	                            break;
	                        case 3:
	                            if(!s4.equals(p3))
	                                f=0;
	                            break;
	                        case 4:
	                            if(!s4.equals(p4))
	                                f=0;
	                            break;
	                }
	                
	               if(f==1)
	               {
	            	   out.println("<h1>Welcome</h1>");
	               }
	               else
	               {
	            	   response.sendRedirect("login");
	               }
       
		
	}
catch(Exception e)
{
response.sendRedirect("login");
}

	}

}
