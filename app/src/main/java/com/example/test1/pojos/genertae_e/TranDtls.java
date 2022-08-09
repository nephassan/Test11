package com.example.test1.pojos.genertae_e;

public class TranDtls{
	private String regRev;
	private String igstOnIntra;
	private Object ecmGstin;
	private String taxSch;
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
