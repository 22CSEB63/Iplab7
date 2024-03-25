import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/PreferencesServlet")
public class PreferencesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get user input from the form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String language = request.getParameter("language");

        // Store user preferences in cookies
        Cookie nameCookie = new Cookie("name", name);
        Cookie emailCookie = new Cookie("email", email);
        Cookie languageCookie = new Cookie("language", language);

        // Set cookie expiration time (1 hour in this case)
        nameCookie.setMaxAge(3600);
        emailCookie.setMaxAge(3600);
        languageCookie.setMaxAge(3600);

        // Add cookies to the response
        response.addCookie(nameCookie);
        response.addCookie(emailCookie);
        response.addCookie(languageCookie);

        // Redirect user to greetings page
        response.sendRedirect("GreetingsServlet");
    }
}
