import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServlertTest1
 */
@WebServlet("/ServlertTest1")
public class Tester extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tester() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //In doGet we create our application to go! The Application builds a getWriter() method and tells us where the servlet is coming from.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		 * The next line sets the content for the page we will make with our servlet.
		 * The following code reads in the content type and IF this form existed, it would fill in values.
		 * Since the form does not exist, it will print out null values.
		 */ try{
				response.setContentType("text/html");

				//The next line initializes our getWriter() method to write the page out.
				PrintWriter out = response.getWriter();
				//The following code is the form page
				String title = "Using GET Method to Read Form Data";
				//The information below uses HTML to format the page that we get n
				String docType =
						"<!doctype html>\n";
				out.println(docType +
						"<html>\n" +
						"<head><title>" + title + "</title></head>\n" +
						"<body bgcolor=\"#f0f0f0\">\n" +
						"<h1 align=\"center\">" + title + "</h1>\n" +
						"<ul>\n" +
						"  <li><b>First Name</b>: "
						+ request.getParameter("first_name") + "\n" +
						"  <li><b>Last Name</b>: "
						+ request.getParameter("last_name") + "\n" +
						"</ul>\n" +
						"<ul>\n" +
						"  <li><b>Identification #: </b>: "
						+ request.getParameter("id") + "\n" +
						"  <li><b>Year: </b>: "
						+ request.getParameter("year") + "\n" +
						"</ul>\n" +
						"<ul>\n" +
						"  <li><b>Major: </b>: "
						+ request.getParameter("major") + "\n" +
						"  <li><b>School: Physics Flag: </b>: "
						+ request.getParameter("school") + "\n" +
						"</ul>\n" +
						"</body></html>");}
		//if something happens above when retrieving the web page, this try-catch block will catch 
		 //the error and throw the whatever exception is there and print it out for us.
		 catch(Exception e){
		      // Here we set error code and reason.
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/* While the above code will retrieve the web page the information below processes the method in a safer manner. You would want 
	to put any code that passes user names or passwords in the doGet.
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
