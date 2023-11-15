import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class c2_6a extends HttpServlet 
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  {
    try 
    {
      			response.setContentType("text/html");
      			PrintWriter pwriter = response.getWriter();
      			Cookie[] ck = request.getCookies();
      			int len = ck.length;
      			String value;
      			pwriter.println("<h3>Hello - </h3>");
      			for (int i = 0; i < len; i++) {
        				value = ck[i].getValue();
        				pwriter.println(value);
      			}
      			pwriter.print("<h2>Records(vinyl) Available</h3>");
            pwriter.print("<h4>Red (TV)</h4>");
            pwriter.print("<h4>Folklore</h4>");
            pwriter.print("<h4>MIdnights</h4>");
            pwriter.print("<h4>Lover</h4>");
            pwriter.close();
    } 
    catch (Exception exp)
    {
      			System.out.println(exp);
    }
  }
}
