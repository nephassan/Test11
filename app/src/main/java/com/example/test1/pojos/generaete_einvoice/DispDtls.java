package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class DispDtls{

	@SerializedName("Loc")
	private String loc;

	@SerializedName("Addr1")
	private String addr1;

	@SerializedName("Addr2")
	private String addr2;

	@SerializedName("Pin")
	private int pin;

	@SerializedName("Stcd")
	private String stcd;

	@SerializedName("Nm")
	private String nm;

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

	public void setNm(String nm){
		this.nm = nm;
	}

	public String getNm(){
		return nm;
	}
}