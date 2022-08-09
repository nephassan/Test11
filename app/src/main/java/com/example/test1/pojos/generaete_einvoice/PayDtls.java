package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class PayDtls{

	@SerializedName("PaidAmt")
	private int paidAmt;

	@SerializedName("CrTrn")
	private String crTrn;

	@SerializedName("DirDr")
	private String dirDr;

	@SerializedName("Mode")
	private String mode;

	@SerializedName("CrDay")
	private int crDay;

	@SerializedName("PayInstr")
	private String payInstr;

	@SerializedName("FinInsBr")
	private String finInsBr;

	@SerializedName("PayTerm")
	private String payTerm;

	@SerializedName("AccDet")
	private String accDet;

	@SerializedName("Nm")
	private String nm;

	@SerializedName("PaymtDue")
	private int paymtDue;

	public void setPaidAmt(int paidAmt){
		this.paidAmt = paidAmt;
	}

	public int getPaidAmt(){
		return paidAmt;
	}

	public void setCrTrn(String crTrn){
		this.crTrn = crTrn;
	}

	public String getCrTrn(){
		return crTrn;
	}

	public void setDirDr(String dirDr){
		this.dirDr = dirDr;
	}

	public String getDirDr(){
		return dirDr;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getMode(){
		return mode;
	}

	public void setCrDay(int crDay){
		this.crDay = crDay;
	}

	public int getCrDay(){
		return crDay;
	}

	public void setPayInstr(String payInstr){
		this.payInstr = payInstr;
	}

	public String getPayInstr(){
		return payInstr;
	}

	public void setFinInsBr(String finInsBr){
		this.finInsBr = finInsBr;
	}

	public String getFinInsBr(){
		return finInsBr;
	}

	public void setPayTerm(String payTerm){
		this.payTerm = payTerm;
	}

	public String getPayTerm(){
		return payTerm;
	}

	public void setAccDet(String accDet){
		this.accDet = accDet;
	}

	public String getAccDet(){
		return accDet;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public String getNm(){
		return nm;
	}

	public void setPaymtDue(int paymtDue){
		this.paymtDue = paymtDue;
	}

	public int getPaymtDue(){
		return paymtDue;
	}
}