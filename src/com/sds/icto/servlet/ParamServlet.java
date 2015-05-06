package com.sds.icto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ParamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		
		PrintWriter out = response.getWriter();
		out.println("a = "+a+", b = "+b);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		
		response.setCharacterEncoding("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("a = "+a+", b = "+b);
	}

}
