package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class BchDtls{

	@SerializedName("WrDt")
	private String wrDt;

	@SerializedName("ExpDt")
	private String expDt;

	@SerializedName("Nm")
	private String nm;

	public void setWrDt(String wrDt){
		this.wrDt = wrDt;
	}

	public String getWrDt(){
		return wrDt;
	}

	public void setExpDt(String expDt){
		this.expDt = expDt;
	}

	public String getExpDt(){
		return expDt;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public String getNm(){
		return nm;
	}
}