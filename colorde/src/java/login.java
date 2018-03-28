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
public class login extends HttpServlet {

    public	String[] color={"#ff0000","#00ff00","#0000ff","#00ffff"};
public int[] num={1,2,3,4}; 	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		shuffle();
		ServletContext con=getServletContext();
		out.print("<html>");
		out.print("<title>login</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form align='center' action='/colorde/s2' method='post'>");
		for(int j=0;j<4;j++)
		{
			if(j==0)
			{
		if(num[j]==1)
		{
			out.print("<input type='text' name='b1' id='r'  style='height:50px;width:10%;background:#ff0000'>");
		}
		else if(num[j]==2)
		{
			out.print("<input type='text' name='b1' id='r'  style='height:50px;width:10%;background:#00ff00'>");
		}
		else if(num[j]==3)
		{
			out.print("<input type='text' name='b1' id='r'  style='height:50px;width:10%;background:#0000ff'>");
		}
		else if(num[j]==4)
		{
			out.print("<input type='text' name='b1' id='r'  style='height:50px;width:10%;background:#ffff00'>");
		}
			}
			
			
			else if(j==1)
			{
		if(num[j]==1)
		{
			out.print("<input type='text' name='b2' id='g' ' style='height:50px;width:10%;background:#ff0000'>");
		}
		else if(num[j]==2)
		{
			out.print("<input type='text' name='b2' id='g'  style='height:50px;width:10%;background:#00ff00'>");
		}
		else if(num[j]==3)
		{
			out.print("<input type='text' name='b2' id='g'  style='height:50px;width:10%;background:#0000ff'>");
		}
		else if(num[j]==4)
		{
			out.print("<input type='text' name='b2' id='g'  style='height:50px;width:10%;background:#ffff00'>");
		}
			}
			else if(j==2)
			{
		if(num[j]==1)
		{
			out.print("<input type='text' name='b3' id='b' style='height:50px;width:10%;background:#ff0000'>");
		}
		else if(num[j]==2)
		{
			out.print("<input type='text' name='b3' id='b' style='height:50px;width:10%;background:#00ff00'>");
		}
		else if(num[j]==3)
		{
			out.print("<input type='text' name='b3' id='b'  style='height:50px;width:10%;background:#0000ff'>");
		}
		else if(num[j]==4)
		{
			out.print("<input type='text' name='b3' id='b'  style='height:50px;width:10%;background:#ffff00'>");
		}
			}
			else if(j==3)
			{
		if(num[j]==1)
		{
			out.print("<input type='text' name='b4' id='y'  style='height:50px;width:10%;background:#ff0000'>");
		}
		else if(num[j]==2)
		{
			out.print("<input type='text' name='b4' id='y' style='height:50px;width:10%;background:#00ff00'>");
		}
		else if(num[j]==3)
		{
			out.print("<input type='text' name='b4' id='y'  style='height:50px;width:10%;background:#0000ff'>");
		}
		else if(num[j]==4)
		{
			out.print("<input type='text' name='b4' id='y'  style='height:50px;width:10%;background:#ffff00'>");
		}
			}
		
		
		}
		out.print("<br><br>");
		out.print("<input type='text' name='bb1' id='rb' '>");
		out.print("<input type='text' name='bb2' id='gb' '>");
		out.print("<input type='text' name='bb3' id='bb' '>");
		out.print("<input type='text' name='bb4' id='yb' >");
		out.print("<br>");
		out.println("<input type='submit' value='submit'>");
		out.print("</form>");
		//out.print<script type="text/javascript" src></script>");
		out.print("</body>");
		out.print("</html>");
		
			con.setAttribute("c1", Integer.toString(num[0]));
			con.setAttribute("c2", Integer.toString(num[1]));
			con.setAttribute("c3", Integer.toString(num[2]));
			con.setAttribute("c4", Integer.toString(num[3]));
                        //response.sendRedirect("s2");
		
		
	}
public void shuffle()
{
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
			{
			int a=(int) Math.floor( Math.random()*color.length);
			int b=(int) Math.floor( Math.random()*color.length);
			String t;
			t=color[a];
			color[a]=color[b];
			color[b]=t;
			
		}
	}
	for(int i=0;i<4;i++)
	{
		if(color[i]=="#ff0000")
		{
			num[i]=1;
		}
		else if(color[i]=="#00ff00")
		{
			num[i]=2;
		}
		else if(color[i]=="#0000ff")
		{
			num[i]=3;
		}
		else if(color[i]=="#00ffff")
		{
			num[i]=4;
		}
	}
	
	
}


	

}
