package org.project.BoardCommand;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.BoardDao.BoardDao;
import org.project.BoardDto.Member_tbl_02;

public class MemberUpdateView implements BoardCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int custNo = Integer.parseInt(request.getParameter("custNo"));
		
		BoardDao dao = BoardDao.getInstance();
		Member_tbl_02 member = dao.check(custNo);
		
		String url = "";
		
		if(member!=null) {
			System.out.println("update view success");
			request.setAttribute("member", member);
			url = "/memberCheck.jsp";
		} else {
			System.out.println("update view fail");
			url = "/index.do";
		}
		request.setAttribute("url", url);
	}
}
