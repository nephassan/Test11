package com.example.test1.pojos.generaete_einvoice;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ItemListItem{

	@SerializedName("SgstAmt")
	private int sgstAmt;

	@SerializedName("Discount")
	private int discount;

	@SerializedName("IsServc")
	private String isServc;

	@SerializedName("CesNonAdvlAmt")
	private int cesNonAdvlAmt;

	@SerializedName("HsnCd")
	private String hsnCd;

	@SerializedName("AttribDtls")
	private List<AttribDtlsItem> attribDtls;

	@SerializedName("Unit")
	private String unit;

	@SerializedName("CesRt")
	private int cesRt;

	@SerializedName("CesAmt")
	private double cesAmt;

	@SerializedName("StateCesNonAdvlAmt")
	private int stateCesNonAdvlAmt;

	@SerializedName("AssAmt")
	private double assAmt;

	@SerializedName("GstRt")
	private double gstRt;

	@SerializedName("Qty")
	private double qty;

	@SerializedName("StateCesAmt")
	private double stateCesAmt;

	@SerializedName("IgstAmt")
	private double igstAmt;

	@SerializedName("OrdLineRef")
	private String ordLineRef;

	@SerializedName("OthChrg")
	private int othChrg;

	@SerializedName("TotAmt")
	private double totAmt;

	@SerializedName("OrgCntry")
	private String orgCntry;

	@SerializedName("CgstAmt")
	private int cgstAmt;

	@SerializedName("PrdDesc")
	private String prdDesc;

	@SerializedName("FreeQty")
	private int freeQty;

	@SerializedName("UnitPrice")
	private double unitPrice;

	@SerializedName("StateCesRt")
	private int stateCesRt;

	@SerializedName("PreTaxVal")
	private int preTaxVal;

	@SerializedName("BchDtls")
	private BchDtls bchDtls;

	@SerializedName("SlNo")
	private String slNo;

	@SerializedName("Barcde")
	private String barcde;

	@SerializedName("TotItemVal")
	private double totItemVal;

	@SerializedName("PrdSlNo")
	private String prdSlNo;

	public void setSgstAmt(int sgstAmt){
		this.sgstAmt = sgstAmt;
	}

	public int getSgstAmt(){
		return sgstAmt;
	}

	public void setDiscount(int discount){
		this.discount = discount;
	}

	public int getDiscount(){
		return discount;
	}

	public void setIsServc(String isServc){
		this.isServc = isServc;
	}

	public String getIsServc(){
		return isServc;
	}

	public void setCesNonAdvlAmt(int cesNonAdvlAmt){
		this.cesNonAdvlAmt = cesNonAdvlAmt;
	}

	public int getCesNonAdvlAmt(){
		return cesNonAdvlAmt;
	}

	public void setHsnCd(String hsnCd){
		this.hsnCd = hsnCd;
	}

	public String getHsnCd(){
		return hsnCd;
	}

	public void setAttribDtls(List<AttribDtlsItem> attribDtls){
		this.attribDtls = attribDtls;
	}

	public List<AttribDtlsItem> getAttribDtls(){
		return attribDtls;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setCesRt(int cesRt){
		this.cesRt = cesRt;
	}

	public int getCesRt(){
		return cesRt;
	}

	public void setCesAmt(double cesAmt){
		this.cesAmt = cesAmt;
	}

	public double getCesAmt(){
		return cesAmt;
	}

	public void setStateCesNonAdvlAmt(int stateCesNonAdvlAmt){
		this.stateCesNonAdvlAmt = stateCesNonAdvlAmt;
	}

	public int getStateCesNonAdvlAmt(){
		return stateCesNonAdvlAmt;
	}

	public void setAssAmt(double assAmt){
		this.assAmt = assAmt;
	}

	public double getAssAmt(){
		return assAmt;
	}

	public void setGstRt(double gstRt){
		this.gstRt = gstRt;
	}

	public double getGstRt(){
		return gstRt;
	}

	public void setQty(double qty){
		this.qty = qty;
	}

	public double getQty(){
		return qty;
	}

	public void setStateCesAmt(double stateCesAmt){
		this.stateCesAmt = stateCesAmt;
	}

	public double getStateCesAmt(){
		return stateCesAmt;
	}

	public void setIgstAmt(double igstAmt){
		this.igstAmt = igstAmt;
	}

	public double getIgstAmt(){
		return igstAmt;
	}

	public void setOrdLineRef(String ordLineRef){
		this.ordLineRef = ordLineRef;
	}

	public String getOrdLineRef(){
		return ordLineRef;
	}

	public void setOthChrg(int othChrg){
		this.othChrg = othChrg;
	}

	public int getOthChrg(){
		return othChrg;
	}

	public void setTotAmt(double totAmt){
		this.totAmt = totAmt;
	}

	public double getTotAmt(){
		return totAmt;
	}

	public void setOrgCntry(String orgCntry){
		this.orgCntry = orgCntry;
	}

	public String getOrgCntry(){
		return orgCntry;
	}

	public void setCgstAmt(int cgstAmt){
		this.cgstAmt = cgstAmt;
	}

	public int getCgstAmt(){
		return cgstAmt;
	}

	public void setPrdDesc(String prdDesc){
		this.prdDesc = prdDesc;
	}

	public String getPrdDesc(){
		return prdDesc;
	}

	public void setFreeQty(int freeQty){
		this.freeQty = freeQty;
	}

	public int getFreeQty(){
		return freeQty;
	}

	public void setUnitPrice(double unitPrice){
		this.unitPrice = unitPrice;
	}

	public double getUnitPrice(){
		return unitPrice;
	}

	public void setStateCesRt(int stateCesRt){
		this.stateCesRt = stateCesRt;
	}

	public int getStateCesRt(){
		return stateCesRt;
	}

	public void setPreTaxVal(int preTaxVal){
		this.preTaxVal = preTaxVal;
	}

	public int getPreTaxVal(){
		return preTaxVal;
	}

	public void setBchDtls(BchDtls bchDtls){
		this.bchDtls = bchDtls;
	}

	public BchDtls getBchDtls(){
		return bchDtls;
	}

	public void setSlNo(String slNo){
		this.slNo = slNo;
	}

	public String getSlNo(){
		return slNo;
	}

	public void setBarcde(String barcde){
		this.barcde = barcde;
	}

	public String getBarcde(){
		return barcde;
	}

	public void setTotItemVal(double totItemVal){
		this.totItemVal = totItemVal;
	}

	public double getTotItemVal(){
		return totItemVal;
	}

	public void setPrdSlNo(String prdSlNo){
		this.prdSlNo = prdSlNo;
	}

	public String getPrdSlNo(){
		return prdSlNo;
	}
}