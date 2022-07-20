"use strict"

const joinForm = document.querySelector('#joinForm');
const custNo = document.querySelector('#custNo');
const custName = document.querySelector('#custName');
const phone = document.querySelector('#phone');
const address = document.querySelector('#address');
const joinDate = document.querySelector('#joinDate');
const grade = document.querySelector('#grade');
const city = document.querySelector('#city');
const joinOkBtn = document.querySelector('#joinOkBtn');
const memberListViewBtn = document.querySelector('#memberListViewBtn');

memberListViewBtn.addEventListener('click', ()=>{

	
	alert("회원조회");
	location.href="memberListView.do";
});


// userId, userAge, userName -> 값을 입력 안하면 팝업 "값을 입력하세요!" 띄우고 다시 입력
// 모두 입력을 하면 form이 정상 실행되도록
	
joinOkBtn.addEventListener('click' ,()=>{
	if(custName==null || custName.value=="" || custName.value<=0) {
		alert("성명을 입력하세요");
		custName.focus();
		return false;
	}
	if (phone==null || phone.value=="" || phone.value<=0) {
		alert("전화번호를 입력하세요")
		phone.focus();
		return false;
	} 
	if (custName==null || custName.value=="" || custName.value<=0) {
		alert("이름을 입력하세요")
		userName.focus();
		return false;
	}
	if (address==null || address.value=="" || address.value<=0) {
		alert("주소를 입력하세요")
		address.focus();
		return false;
	}
	if (joinDate==null || joinDate.value=="" || joinDate.value<=0) {
		alert("주소를 입력하세요")
		joinDate.focus();
		return false;
	}
	if (grade==null || grade.value=="" || grade.value<=0) {
		alert("등급을 입력하세요")
		grade.focus();
		return false;
	}
	if (city==null || city.value=="" || city.value<=0) {
		alert("도시코드를 입력하세요")
		city.focus();
		return false;
	}
	joinForm.submit();
	alert("회원가입 완료");
		
		
});