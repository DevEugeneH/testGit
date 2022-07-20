package org.project.BoardDto;

import java.util.Date;

public class Money_tbl_02 {

	private int custNo;
	private int saleNol;
	private int pCost;
	private int amount;
	private int price;
	private String pCode;
	private Date sDate;

	public Money_tbl_02(int custNo, int saleNol, int pCost, int amount, int price, String pCode, Date sDate) {
		super();
		this.custNo = custNo;
		this.saleNol = saleNol;
		this.pCost = pCost;
		this.amount = amount;
		this.price = price;
		this.pCode = pCode;
		this.sDate = sDate;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public int getSaleNol() {
		return saleNol;
	}

	public void setSaleNol(int saleNol) {
		this.saleNol = saleNol;
	}

	public int getpCost() {
		return pCost;
	}

	public void setpCost(int pCost) {
		this.pCost = pCost;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public Date getsDate() {
		return sDate;
	}

	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}

}
