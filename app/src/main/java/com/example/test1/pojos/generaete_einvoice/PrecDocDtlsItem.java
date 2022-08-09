package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class PrecDocDtlsItem{

	@SerializedName("InvDt")
	private String invDt;

	@SerializedName("InvNo")
	private String invNo;

	@SerializedName("OthRefNo")
	private String othRefNo;

	public void setInvDt(String invDt){
		this.invDt = invDt;
	}

	public String getInvDt(){
		return invDt;
	}

	public void setInvNo(String invNo){
		this.invNo = invNo;
	}

	public String getInvNo(){
		return invNo;
	}

	public void setOthRefNo(String othRefNo){
		this.othRefNo = othRefNo;
	}

	public String getOthRefNo(){
		return othRefNo;
	}
}