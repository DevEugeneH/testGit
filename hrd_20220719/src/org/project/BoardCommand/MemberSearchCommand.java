package org.project.BoardCommand;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.BoardDao.BoardDao;
import org.project.BoardDto.Member_tbl_02;

public class MemberSearchCommand implements BoardCommand{
	
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDao dao = BoardDao.getInstance();
		ArrayList<Member_tbl_02> member = dao.member();
		
		String url = "";
		
		if(member!=null) {
			System.out.println("search success");
			url = "/memberListView.jsp";
			request.setAttribute("member", member);
		} else {
			System.out.println("search fail");
			url = "index.do";
		}
		
		request.setAttribute("url", url);
	}
	
}
