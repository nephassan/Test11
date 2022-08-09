package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class ExpDtls{

	@SerializedName("ForCur")
	private String forCur;

	@SerializedName("Port")
	private String port;

	@SerializedName("RefClm")
	private String refClm;

	@SerializedName("ShipBDt")
	private String shipBDt;

	@SerializedName("ShipBNo")
	private String shipBNo;

	@SerializedName("CntCode")
	private String cntCode;

	public void setForCur(String forCur){
		this.forCur = forCur;
	}

	public String getForCur(){
		return forCur;
	}

	public void setPort(String port){
		this.port = port;
	}

	public String getPort(){
		return port;
	}

	public void setRefClm(String refClm){
		this.refClm = refClm;
	}

	public String getRefClm(){
		return refClm;
	}

	public void setShipBDt(String shipBDt){
		this.shipBDt = shipBDt;
	}

	public String getShipBDt(){
		return shipBDt;
	}

	public void setShipBNo(String shipBNo){
		this.shipBNo = shipBNo;
	}

	public String getShipBNo(){
		return shipBNo;
	}

	public void setCntCode(String cntCode){
		this.cntCode = cntCode;
	}

	public String getCntCode(){
		return cntCode;
	}
}