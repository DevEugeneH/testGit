package org.project.BoardCommand;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.BoardDao.BoardDao;
import org.project.BoardDto.MemberSaleDto;

public class MemberSaleView implements BoardCommand{
	@Override
	public void executeCommand(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDao dao = BoardDao.getInstance();
		ArrayList<MemberSaleDto> sale =  dao.sale();
		
		String url = "";
		
		if(sale!=null) {
			System.out.println("sale search success");
			url = "memberSaleView.jsp";
			request.setAttribute("sale", sale);
		} else {
			System.out.println("sale search fail");
			url = "/index.do";
		}
		request.setAttribute("url", url);
	}
}
