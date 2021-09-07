package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet - List Servlet");
		
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		
		String[] id = {"Tiger", "Elephent", "Bird"};
		
		PrintWriter out = response.getWriter();
		String strHTML = "";
		
		strHTML += "<table border='1' width='300'>";
		strHTML += "<tr>";
		strHTML += 		"<td>이름</td>";
		strHTML += 		"<td>삭제</td>";
		strHTML += 		"<td>수정</td>";
		strHTML += "<tr>";
		
		for(int i=0; i<id.length; i++)
		{
			strHTML += "<tr>";
			strHTML += 		"<td>"+id[i]+"</td>";
			strHTML += 		"<td><a href='delete?id="+id[i]+"'>삭제</a></td>";
			strHTML += 		"<td><a href='update?id="+id[i]+"'>수정</a></td>";
			strHTML += "<tr>";
		}
		
		strHTML += "</table>";
		
		
		out.println("<html><body>");
		out.println(strHTML);
		out.println("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost - List Servlet");

	}

}
