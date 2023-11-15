import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ex5b extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Welcome back";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

         
       out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>Name</b>: "
                  + request.getParameter("name") + "\n" +
                  "  <li><b>Place</b>: "
                  + request.getParameter("age") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );
      out.println(docType +
         "<html>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<ul>\n" +
                  "  <li><b>POP: </b>: "
                  + request.getParameter("pop") + "\n" +
                  "  <li><b>ROCK: </b>: "
                  + request.getParameter("rock") + "\n" +
                  "  <li><b>COUNTRY: </b>: "
                  + request.getParameter("country") + "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );

   }
}