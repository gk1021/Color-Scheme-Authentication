/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
/**
 *
 * @author Acer
 */
public class s2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try{		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext con=getServletContext();
		String p1=(String) con.getAttribute("p1");
                String p2=(String) con.getAttribute("p2");
		String p3=(String) con.getAttribute("p3");
		String p4=(String) con.getAttribute("p4");
		int c1=Integer.parseInt((String) con.getAttribute("c1"));
		int c2=Integer.parseInt((String) con.getAttribute("c2"));
                int c3=Integer.parseInt((String) con.getAttribute("c3"));
                int c4=Integer.parseInt((String) con.getAttribute("c4"));
                String s1=request.getParameter("bb1");
                String s2=request.getParameter("bb2");
                String s3=request.getParameter("bb3");
                String s4=request.getParameter("bb4");
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
