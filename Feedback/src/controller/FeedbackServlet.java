package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FeedbackServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String enrolment =request.getParameter("enrolment");
		String branch= request.getParameter("branch");
		String feedback=request.getParameter("feedback");
		
		 String un="b2500aa45f7708",
				up="aeec684b",
			url="jdbc:mysql://au-cdbr-sl-syd-01.cleardb.net:3306/ibmx_9386c257e3d0331";
		
		
		
		 Connection cn=null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cn=DriverManager.getConnection(url,un,up);
				
				String sql="insert into feedback(name,enrolment,branch,feedback) values('"+name+"','"+enrolment+"','"+branch+"','"+feedback+"')";
				PreparedStatement ps=cn.prepareStatement(sql);
				ps.executeUpdate();
				
			} 
			catch (Exception e) {
			
				e.printStackTrace();
			}
		
		
		
		
		
		
	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

}
