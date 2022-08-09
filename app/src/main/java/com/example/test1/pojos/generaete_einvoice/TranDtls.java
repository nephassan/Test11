package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class TranDtls{

	@SerializedName("RegRev")
	private String regRev;

	@SerializedName("IgstOnIntra")
	private String igstOnIntra;

	@SerializedName("EcmGstin")
	private Object ecmGstin;

	@SerializedName("TaxSch")
	private String taxSch;

	@SerializedName("SupTyp")
	private String supTyp;

	public void setRegRev(String regRev){
		this.regRev = regRev;
	}

	public String getRegRev(){
		return regRev;
	}

	public void setIgstOnIntra(String igstOnIntra){
		this.igstOnIntra = igstOnIntra;
	}

	public String getIgstOnIntra(){
		return igstOnIntra;
	}

	public void setEcmGstin(Object ecmGstin){
		this.ecmGstin = ecmGstin;
	}

	public Object getEcmGstin(){
		return ecmGstin;
	}

	public void setTaxSch(String taxSch){
		this.taxSch = taxSch;
	}

	public String getTaxSch(){
		return taxSch;
	}

	public void setSupTyp(String supTyp){
		this.supTyp = supTyp;
	}

	public String getSupTyp(){
		return supTyp;
	}
}