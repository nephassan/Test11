package com.example.test1.pojos.generaete_einvoice;

import com.google.gson.annotations.SerializedName;

public class CustomFields{

	@SerializedName("customfieldLable1")
	private String customfieldLable1;

	@SerializedName("customfieldLable2")
	private String customfieldLable2;

	@SerializedName("customfieldLable3")
	private String customfieldLable3;

	public void setCustomfieldLable1(String customfieldLable1){
		this.customfieldLable1 = customfieldLable1;
	}

	public String getCustomfieldLable1(){
		return customfieldLable1;
	}

	public void setCustomfieldLable2(String customfieldLable2){
		this.customfieldLable2 = customfieldLable2;
	}

	public String getCustomfieldLable2(){
		return customfieldLable2;
	}

	public void setCustomfieldLable3(String customfieldLable3){
		this.customfieldLable3 = customfieldLable3;
	}

	public String getCustomfieldLable3(){
		return customfieldLable3;
	}
}