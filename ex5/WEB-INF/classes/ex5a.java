import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ex5a extends HttpServlet {
   private String message;
   public void init() throws ServletException {
      message = "Welcome to 1989 vinyl store";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
      out.println("<p>1989 (Taylor's Version)  out now!!!</p>");
      out.println("<p style=font-family:sans-serif>An easy search on living.</p>");
      out.println("<p style=font-family: Verdana, Geneva, Tahoma, sans-serif;>Home Sweet Home is a wonderful place to be.</p>");
   }

   public void destroy() {
      // do nothing.
   }
}
