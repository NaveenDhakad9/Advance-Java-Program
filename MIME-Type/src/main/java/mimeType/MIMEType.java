package mimeType;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MIMEType
 */

public class MIMEType extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public MIMEType() {
        super();
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("application/msword");
		PrintWriter pw = response.getWriter();
		pw.println("Welcome0.........!");
	}

}
