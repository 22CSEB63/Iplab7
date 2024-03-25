import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/SportsQuestionsServlet")
public class SportsQuestionsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");

       
        PrintWriter out = response.getWriter();

      
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sports Questions</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Sports Questions</h1>");
        out.println("<ul>");
        out.println("<li><a href=\"RosterServlet?question=1\">Question 1: [Question 1 here]</a></li>");
        out.println("<li><a href=\"RosterServlet?question=2\">Question 2: [Question 2 here]</a></li>");
        
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

    
        out.close();
    }
}
