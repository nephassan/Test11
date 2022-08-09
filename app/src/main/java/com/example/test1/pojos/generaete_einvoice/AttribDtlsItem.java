package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class AttribDtlsItem{

	@SerializedName("Val")
	private String val;

	@SerializedName("Nm")
	private String nm;

	public void setVal(String val){
		this.val = val;
	}

	public String getVal(){
		return val;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public String getNm(){
		return nm;
	}
}