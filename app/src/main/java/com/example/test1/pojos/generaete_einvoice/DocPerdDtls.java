package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class DocPerdDtls{

	@SerializedName("InvStDt")
	private String invStDt;

	@SerializedName("InvEndDt")
	private String invEndDt;

	public void setInvStDt(String invStDt){
		this.invStDt = invStDt;
	}

	public String getInvStDt(){
		return invStDt;
	}

	public void setInvEndDt(String invEndDt){
		this.invEndDt = invEndDt;
	}

	public String getInvEndDt(){
		return invEndDt;
	}
}