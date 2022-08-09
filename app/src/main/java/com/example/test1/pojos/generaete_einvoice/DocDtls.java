package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class DocDtls{

	@SerializedName("Dt")
	private String dt;

	@SerializedName("No")
	private String no;

	@SerializedName("Typ")
	private String typ;

	public void setDt(String dt){
		this.dt = dt;
	}

	public String getDt(){
		return dt;
	}

	public void setNo(String no){
		this.no = no;
	}

	public String getNo(){
		return no;
	}

	public void setTyp(String typ){
		this.typ = typ;
	}

	public String getTyp(){
		return typ;
	}
}