package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class ContrDtlsItem{

	@SerializedName("PORefDt")
	private String pORefDt;

	@SerializedName("TendRefr")
	private String tendRefr;

	@SerializedName("ProjRefr")
	private String projRefr;

	@SerializedName("ContrRefr")
	private String contrRefr;

	@SerializedName("RecAdvRefr")
	private String recAdvRefr;

	@SerializedName("RecAdvDt")
	private String recAdvDt;

	@SerializedName("ExtRefr")
	private String extRefr;

	@SerializedName("PORefr")
	private String pORefr;

	public void setPORefDt(String pORefDt){
		this.pORefDt = pORefDt;
	}

	public String getPORefDt(){
		return pORefDt;
	}

	public void setTendRefr(String tendRefr){
		this.tendRefr = tendRefr;
	}

	public String getTendRefr(){
		return tendRefr;
	}

	public void setProjRefr(String projRefr){
		this.projRefr = projRefr;
	}

	public String getProjRefr(){
		return projRefr;
	}

	public void setContrRefr(String contrRefr){
		this.contrRefr = contrRefr;
	}

	public String getContrRefr(){
		return contrRefr;
	}

	public void setRecAdvRefr(String recAdvRefr){
		this.recAdvRefr = recAdvRefr;
	}

	public String getRecAdvRefr(){
		return recAdvRefr;
	}

	public void setRecAdvDt(String recAdvDt){
		this.recAdvDt = recAdvDt;
	}

	public String getRecAdvDt(){
		return recAdvDt;
	}

	public void setExtRefr(String extRefr){
		this.extRefr = extRefr;
	}

	public String getExtRefr(){
		return extRefr;
	}

	public void setPORefr(String pORefr){
		this.pORefr = pORefr;
	}

	public String getPORefr(){
		return pORefr;
	}
}