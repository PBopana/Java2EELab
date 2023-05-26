import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class back extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public back() {
        super();
        
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String salary=request.getParameter("salary");
		String tax=request.getParameter("tax");
		PrintWriter out=response.getWriter();
		out.println("<h1>Hi, "+name);
		out.println("<h1>your Salary, "+salary);
		out.println("<h1>Tax deducted, "+tax);
		File fd=new File("C:\\Users\\gbopa\\Desktop\\jav\\test.txt");
		fd.createNewFile();
		FileOutputStream fout=new FileOutputStream(fd);
		fout.write(("Hello"+name+gender+salary+tax).getBytes());
		fout.close();
		out.close();
		
}
}
