package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class ValDtls{

	@SerializedName("CgstVal")
	private int cgstVal;

	@SerializedName("Discount")
	private int discount;

	@SerializedName("AssVal")
	private double assVal;

	@SerializedName("OthChrg")
	private int othChrg;

	@SerializedName("IgstVal")
	private double igstVal;

	@SerializedName("RndOffAmt")
	private double rndOffAmt;

	@SerializedName("CesVal")
	private double cesVal;

	@SerializedName("TotInvVal")
	private int totInvVal;

	@SerializedName("TotInvValFc")
	private double totInvValFc;

	@SerializedName("StCesVal")
	private double stCesVal;

	@SerializedName("SgstVal")
	private int sgstVal;

	public void setCgstVal(int cgstVal){
		this.cgstVal = cgstVal;
	}

	public int getCgstVal(){
		return cgstVal;
	}

	public void setDiscount(int discount){
		this.discount = discount;
	}

	public int getDiscount(){
		return discount;
	}

	public void setAssVal(double assVal){
		this.assVal = assVal;
	}

	public double getAssVal(){
		return assVal;
	}

	public void setOthChrg(int othChrg){
		this.othChrg = othChrg;
	}

	public int getOthChrg(){
		return othChrg;
	}

	public void setIgstVal(double igstVal){
		this.igstVal = igstVal;
	}

	public double getIgstVal(){
		return igstVal;
	}

	public void setRndOffAmt(double rndOffAmt){
		this.rndOffAmt = rndOffAmt;
	}

	public double getRndOffAmt(){
		return rndOffAmt;
	}

	public void setCesVal(double cesVal){
		this.cesVal = cesVal;
	}

	public double getCesVal(){
		return cesVal;
	}

	public void setTotInvVal(int totInvVal){
		this.totInvVal = totInvVal;
	}

	public int getTotInvVal(){
		return totInvVal;
	}

	public void setTotInvValFc(double totInvValFc){
		this.totInvValFc = totInvValFc;
	}

	public double getTotInvValFc(){
		return totInvValFc;
	}

	public void setStCesVal(double stCesVal){
		this.stCesVal = stCesVal;
	}

	public double getStCesVal(){
		return stCesVal;
	}

	public void setSgstVal(int sgstVal){
		this.sgstVal = sgstVal;
	}

	public int getSgstVal(){
		return sgstVal;
	}
}