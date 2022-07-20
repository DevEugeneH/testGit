<%@page import="org.project.BoardDto.Member_tbl_02"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member_tbl_02 member = (Member_tbl_02) request.getAttribute("member");
%>
<div class="container">
	<div class="inner-container">
		<div class="check">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<form action="updateOk.do" method="POST" id="updateForm">
							<table>
							<thead>
								<tr>
									<th colspan="2">
										<h1>홈쇼핑 회원 정보 수정</h1>
									</th>
								</tr>
								</thead>
								<tbody>
									<tr>
										<td><label for="custNo">회원번호(수정불가)</label> </td>
										<td><input type="hidden" id="custNo" name="custNo" value="<%=member.getCustNo()%>" />
											<span><%=member.getCustNo() %></span>
										</td>
									</tr>
									<tr>
										<td><label for="custName">회원이름</label></td>
										<td><input type="text" id="custName" name="custName" /></td>
									</tr>
									<tr>
										<td><label for="phone">회원전화</label></td>
										<td><input type="text" id="phone" name="phone" /></td>
									</tr>
									<tr>
										<td><label for="address">회원주소</label></td>
										<td><input type="text" id="address" name="address" /></td>
									</tr>
									<tr>
										<td><label for="joinDate">가입일</label></td>
										<td><input type="text" id="joinDate" name="joinDate" /></td>
									</tr>
									<tr>
										<td><label for="grade">고객등급(A:VIP, B:일반, C:직원)</label></td>
										<td><input type="text" id="grade" name="grade" /></td>
									</tr>
									<tr>
										<td><label for="city">도시코드</label></td>
										<td><input type="text" id="city" name="city" /></td>
									</tr>
								</tbody>
								<tfoot>
									<tr>
										<td colspan="2">
										<input type="button" value="수정" id="updateOkBtn" class="s1" />
										<input type="button" value="조회" id="memberListViewBtn" class="s1"/>
										</td>
									</tr>
								</tfoot>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>