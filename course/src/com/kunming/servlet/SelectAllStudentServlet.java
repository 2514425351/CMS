package com.kunming.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kunming.bean.SC;
import com.kunming.service.SCService;
import com.kunming.serviceImpl.SCServiceImpl;

@WebServlet("/SelectAllStudentServlet")
public class SelectAllStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectAllStudentServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/heml;charset=UTF-8");
		SCService scService = new SCServiceImpl();
		List<SC> list = scService.getAllSc();
		request.setAttribute("list", list);
		request.getRequestDispatcher("stu/selectStu.jsp").forward(request,response );
		
	}

}
