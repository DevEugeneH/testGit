"use strict"

const updateForm = document.querySelector('#updateForm');
const updateOkBtn = document.querySelector('#updateOkBtn')
const custNo = document.querySelector('#custNo');
const custName = document.querySelector('#custName');
const phone = document.querySelector('#phone');
const address = document.querySelector('#address');
const joinDate = document.querySelector('#joinDate');
const grade = document.querySelector('#grade');
const city = document.querySelector('#city');

const MemberListViewBtn = document.querySelector('#memberListViewBtn');

memberListViewBtn.addEventListener('click', () =>{
	
	location.href="memberListView.do";
});

updateOkBtn.addEventListener('click', ()=>{
	
	if(custName==null || custName.value=="" || custName.value<=0) {
		alert("성명을 입력하세요");
		custName.focus();
		return false
	}
	if(phone==null || phone.value=="" || phone.value<=0) {
		alert("전화번호를 입력하세요");
		phone.focus();
		return false
	}
	if(address==null || address.value=="" || address.value<=0) {
		alert("주소를 입력하세요");
		address.focus();
		return false
	}
	if(joinDate==null || joinDate.value=="" || joinDate.value<=0) {
		alert("가입날짜를 입력하세요");
		joinDate.focus();
		return false
	}
	if(grade==null || grade.value=="" || grade.value<=0) {
		alert("등급을 입력하세요");
		grade.focus();
		return false
	}
	if(city==null || city.value=="" || city.value<=0) {
		alert("도시코드를 입력하세요");
		city.focus();
		return false
	}
	updateForm.submit();
	alert("회원 수정 실행")
});