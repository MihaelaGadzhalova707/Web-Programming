

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, String> hashmap = new HashMap<String, String>();  
	
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		ServletOutputStream out = response.getOutputStream();
		String quotes = "\"";
		
		out.println("<html><body><font size=3>\r\n" +
				"<form method='POST'>\r\n" +
				"Enter key below: <br>\r\n" +
				"<input type='text' name='key' placeholder='Key:'/><br> \r\n" +
				"<br>" +
				"Enter value below: <br>\r\n" +
				"<input type='text' name='value' placeholder='Value:' /><br> \r\n" +
				"<br>" +
				"<input type='submit' value='Submit'/><br>\r\n" +
				"</form>" +	
				"</font></body></html>");
		
		for(HashMap.Entry<String, String> map : hashmap.entrySet()) {
			out.println("Key: " + quotes +
					map.getKey() + quotes +
					" => " + 
					"Value: " + quotes +
					map.getValue()+ quotes +
					"<br> \r\n"
				);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		hashmap.put(request.getParameter("key"),request.getParameter("value"));
		doGet(request,response);
	}

}
