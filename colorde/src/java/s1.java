

/*import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServeletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletContext;
        
public class s1 extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		String c1=request.getParameter("rb1");
		String c2=request.getParameter("gb1");
		String c3=request.getParameter("bb1");
		String c4=request.getParameter("yb1");
		ServletContext con=getServletContext();
		con.setAttribute("p1", c1);
		con.setAttribute("p2", c2);
		con.setAttribute("p3", c3);
		con.setAttribute("p4", c4);
		response.sendRedirect("login");
		    
           
        }
    

   
}
