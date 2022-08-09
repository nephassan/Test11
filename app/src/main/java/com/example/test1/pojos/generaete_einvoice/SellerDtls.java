package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class SellerDtls{

	@SerializedName("TrdNm")
	private String trdNm;

	@SerializedName("Loc")
	private String loc;

	@SerializedName("Addr1")
	private String addr1;

	@SerializedName("Gstin")
	private String gstin;

	@SerializedName("Addr2")
	private String addr2;

	@SerializedName("Pin")
	private int pin;

	@SerializedName("Stcd")
	private String stcd;

	@SerializedName("Ph")
	private String ph;

	@SerializedName("Em")
	private String em;

	@SerializedName("LglNm")
	private String lglNm;

	public void setTrdNm(String trdNm){
		this.trdNm = trdNm;
	}

	public String getTrdNm(){
		return trdNm;
	}

	public void setLoc(String loc){
		this.loc = loc;
	}

	public String getLoc(){
		return loc;
	}

	public void setAddr1(String addr1){
		this.addr1 = addr1;
	}

	public String getAddr1(){
		return addr1;
	}

	public void setGstin(String gstin){
		this.gstin = gstin;
	}

	public String getGstin(){
		return gstin;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public String getAddr2(){
		return addr2;
	}

	public void setPin(int pin){
		this.pin = pin;
	}

	public int getPin(){
		return pin;
	}

	public void setStcd(String stcd){
		this.stcd = stcd;
	}

	public String getStcd(){
		return stcd;
	}

	public void setPh(String ph){
		this.ph = ph;
	}

	public String getPh(){
		return ph;
	}

	public void setEm(String em){
		this.em = em;
	}

	public String getEm(){
		return em;
	}

	public void setLglNm(String lglNm){
		this.lglNm = lglNm;
	}

	public String getLglNm(){
		return lglNm;
	}
}