import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class c1_6a extends HttpServlet
{
  public void doPost(HttpServletRequest request, HttpServletResponse response)   throws ServletException, IOException 
  {
    try 
    {
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();
      String in_uname = request.getParameter("uname");
			Cookie c = new Cookie("UserCookie", in_uname);
      response.addCookie(c);
      pwriter.print("<h3>1989 TV Vinyl Store</h3>" + in_uname);
      pwriter.println("<br /> Click here to know your status");
      pwriter.print("<br /> <a href='cookieC2'>Activities</a>");
      pwriter.close();
    } 
    catch (Exception exp) 
    {
      System.out.println(exp);
    }
  }
}
