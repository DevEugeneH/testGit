package org.project.BoardController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.BoardCommand.BoardCommand;
import org.project.BoardCommand.MemberInsertCommand;
import org.project.BoardCommand.MemberJoinView;
import org.project.BoardCommand.MemberSaleView;
import org.project.BoardCommand.MemberSearchCommand;
import org.project.BoardCommand.MemberUpdateCommand;
import org.project.BoardCommand.MemberUpdateView;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doAction(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doAction(request, response);
	}

	public void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		
		String basicURL = uri.substring(path.length()+1, uri.length()-3);
		
		System.out.println(basicURL);
		String url = "";
		BoardCommand command = null;
		
		
		if(basicURL.equals("index")) {
			url = "/index.jsp";
		} else if (basicURL.equals("joinView")) {
			command = new MemberJoinView();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("joinOk")) {
			command = new MemberInsertCommand();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("memberListView")) {
			command = new MemberSearchCommand();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if (basicURL.equals("memberSalesView")) {
			command = new MemberSaleView();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		} else if(basicURL.equals("memberCheck")) {
			command = new MemberUpdateView();
			command.executeCommand(request, response);
			url = (String)request.getAttribute("url");
		} else if(basicURL.equals("updateOk")) {
			command = new MemberUpdateCommand();
			command.executeCommand(request, response);
			url = (String) request.getAttribute("url");
		}
		  
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
