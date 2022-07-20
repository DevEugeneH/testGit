package org.project.BoardCommand;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.BoardDao.BoardDao;

public class MemberJoinView implements BoardCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원등록");
		
		BoardDao dao = BoardDao.getInstance();
		int custNo = dao.custNoMax();
		
		String url = "";
		
		if(custNo!=0) {
			System.out.println("success");
			request.setAttribute("custNo", custNo);
			url = "join.jsp";
		} else { 
			System.out.println("fail");
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
