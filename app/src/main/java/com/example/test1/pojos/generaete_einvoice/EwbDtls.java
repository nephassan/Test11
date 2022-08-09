package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class EwbDtls{

	@SerializedName("TransDocNo")
	private String transDocNo;

	@SerializedName("TransDocDt")
	private String transDocDt;

	@SerializedName("VehNo")
	private String vehNo;

	@SerializedName("VehType")
	private String vehType;

	@SerializedName("TransName")
	private String transName;

	@SerializedName("TransId")
	private String transId;

	@SerializedName("Distance")
	private int distance;

	@SerializedName("TransMode")
	private String transMode;

	public void setTransDocNo(String transDocNo){
		this.transDocNo = transDocNo;
	}

	public String getTransDocNo(){
		return transDocNo;
	}

	public void setTransDocDt(String transDocDt){
		this.transDocDt = transDocDt;
	}

	public String getTransDocDt(){
		return transDocDt;
	}

	public void setVehNo(String vehNo){
		this.vehNo = vehNo;
	}

	public String getVehNo(){
		return vehNo;
	}

	public void setVehType(String vehType){
		this.vehType = vehType;
	}

	public String getVehType(){
		return vehType;
	}

	public void setTransName(String transName){
		this.transName = transName;
	}

	public String getTransName(){
		return transName;
	}

	public void setTransId(String transId){
		this.transId = transId;
	}

	public String getTransId(){
		return transId;
	}

	public void setDistance(int distance){
		this.distance = distance;
	}

	public int getDistance(){
		return distance;
	}

	public void setTransMode(String transMode){
		this.transMode = transMode;
	}

	public String getTransMode(){
		return transMode;
	}
}