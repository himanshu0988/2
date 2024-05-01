package in.ineuron.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestApp")
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("image/jpg");
		
		File file=new File("C:\\Users\\HIMANSHU\\eclipse-workspace\\RequestInfoApp\\nitin.JPG");
		FileInputStream fis=new FileInputStream(file);
		
		byte [] b=new byte[(int) file.length()];
		fis.read(b);
		
		ServletOutputStream sop= response.getOutputStream();
		sop.write(b);
		
		sop.flush();
		sop.close();
		fis.close();
	}

}
