package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class AddlDocDtlsItem{

	@SerializedName("Docs")
	private String docs;

	@SerializedName("Info")
	private String info;

	@SerializedName("Url")
	private String url;

	public void setDocs(String docs){
		this.docs = docs;
	}

	public String getDocs(){
		return docs;
	}

	public void setInfo(String info){
		this.info = info;
	}

	public String getInfo(){
		return info;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}
}