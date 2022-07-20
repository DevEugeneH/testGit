package org.project.BoardCommand;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.BoardDao.BoardDao;

public class MemberUpdateCommand implements BoardCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int custNo = Integer.parseInt(request.getParameter("custNo"));
		String custName = request.getParameter("custName");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String joinDate = request.getParameter("joinDate");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		
		BoardDao dao = BoardDao.getInstance();
		int rs = dao.updateDo(custNo, custName, phone, address, joinDate, grade, city);
		
		String url = "";
		
		if(rs!=1) {
			System.out.println("update fail");
			url = "memberCheck.do";
		} else {
			System.out.println("update success");
			url = "memberListView.do";
		}
		request.setAttribute("url", url);
	}
}
