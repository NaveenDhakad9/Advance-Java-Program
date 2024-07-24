package basics;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.GenericServlet;

public class FirstServlet extends GenericServlet {
    private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // Set the response content type
        PrintWriter pw = response.getWriter();
        pw.println("Welcome to servlet..");
    }
}
