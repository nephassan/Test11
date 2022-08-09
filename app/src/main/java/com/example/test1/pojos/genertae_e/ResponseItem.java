package com.example.test1.pojos.genertae_e;

public class ResponseItem{
	private CustomFields customFields;
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
