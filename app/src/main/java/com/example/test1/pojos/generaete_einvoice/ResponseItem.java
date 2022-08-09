package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class ResponseItem{

	@SerializedName("custom_fields")
	private CustomFields customFields;

	@SerializedName("transaction")
	private Transaction transaction;

	public void setCustomFields(CustomFields customFields){
		this.customFields = customFields;
	}

	public CustomFields getCustomFields(){
		return customFields;
	}

	public void setTransaction(Transaction transaction){
		this.transaction = transaction;
	}

	public Transaction getTransaction(){
		return transaction;
	}
}