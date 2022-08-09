package com.example.test1.pojos.generaete_einvoice;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Transaction{

	@SerializedName("EwbDtls")
	private EwbDtls ewbDtls;

	@SerializedName("AddlDocDtls")
	private List<AddlDocDtlsItem> addlDocDtls;

	@SerializedName("ValDtls")
	private ValDtls valDtls;

	@SerializedName("DocDtls")
	private DocDtls docDtls;

	@SerializedName("BuyerDtls")
	private BuyerDtls buyerDtls;

	@SerializedName("ExpDtls")
	private ExpDtls expDtls;

	@SerializedName("ShipDtls")
	private ShipDtls shipDtls;

	@SerializedName("Version")
	private String version;

	@SerializedName("ItemList")
	private List<ItemListItem> itemList;

	@SerializedName("SellerDtls")
	private SellerDtls sellerDtls;

	@SerializedName("RefDtls")
	private RefDtls refDtls;

	@SerializedName("PayDtls")
	private PayDtls payDtls;

	@SerializedName("TranDtls")
	private TranDtls tranDtls;

	@SerializedName("DispDtls")
	private DispDtls dispDtls;

	public void setEwbDtls(EwbDtls ewbDtls){
		this.ewbDtls = ewbDtls;
	}

	public EwbDtls getEwbDtls(){
		return ewbDtls;
	}

	public void setAddlDocDtls(List<AddlDocDtlsItem> addlDocDtls){
		this.addlDocDtls = addlDocDtls;
	}

	public List<AddlDocDtlsItem> getAddlDocDtls(){
		return addlDocDtls;
	}

	public void setValDtls(ValDtls valDtls){
		this.valDtls = valDtls;
	}

	public ValDtls getValDtls(){
		return valDtls;
	}

	public void setDocDtls(DocDtls docDtls){
		this.docDtls = docDtls;
	}

	public DocDtls getDocDtls(){
		return docDtls;
	}

	public void setBuyerDtls(BuyerDtls buyerDtls){
		this.buyerDtls = buyerDtls;
	}

	public BuyerDtls getBuyerDtls(){
		return buyerDtls;
	}

	public void setExpDtls(ExpDtls expDtls){
		this.expDtls = expDtls;
	}

	public ExpDtls getExpDtls(){
		return expDtls;
	}

	public void setShipDtls(ShipDtls shipDtls){
		this.shipDtls = shipDtls;
	}

	public ShipDtls getShipDtls(){
		return shipDtls;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setItemList(List<ItemListItem> itemList){
		this.itemList = itemList;
	}

	public List<ItemListItem> getItemList(){
		return itemList;
	}

	public void setSellerDtls(SellerDtls sellerDtls){
		this.sellerDtls = sellerDtls;
	}

	public SellerDtls getSellerDtls(){
		return sellerDtls;
	}

	public void setRefDtls(RefDtls refDtls){
		this.refDtls = refDtls;
	}

	public RefDtls getRefDtls(){
		return refDtls;
	}

	public void setPayDtls(PayDtls payDtls){
		this.payDtls = payDtls;
	}

	public PayDtls getPayDtls(){
		return payDtls;
	}

	public void setTranDtls(TranDtls tranDtls){
		this.tranDtls = tranDtls;
	}

	public TranDtls getTranDtls(){
		return tranDtls;
	}

	public void setDispDtls(DispDtls dispDtls){
		this.dispDtls = dispDtls;
	}

	public DispDtls getDispDtls(){
		return dispDtls;
	}
}