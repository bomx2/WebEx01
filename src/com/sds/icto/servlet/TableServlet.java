package com.sds.icto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TableServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out = response.getWriter();
		
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		
		int nRow = Integer.parseInt(row);
		if(row==null){
			nRow = 3;
		}else{
			nRow = Integer.parseInt(row);
		}
		int nCol = Integer.parseInt(col);
		if(col==null){
			nCol = 3;
		}else{
			nCol = Integer.parseInt(col);
		}
		
		out.println("<table border='1px' cellpadding='10px' cellspacing='0'>");
		for (int i = 0; i < nRow; i++) {
			out.println("<tr>");
			for (int j = 0; j < nCol; j++) {
				out.println("<td>셀("+i+","+j+")</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("<table border='1px' cellpadding='10px' cellspacing='0'>");
		out.println("<tr>");
		out.println("<td>셀(0,0)</td>");
		out.println("</tr>");
		out.println("</table>");*/
	}

}
