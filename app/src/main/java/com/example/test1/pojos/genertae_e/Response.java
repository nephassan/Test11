package com.example.test1.pojos.genertae_e;

import java.util.List;

public class Response{
	private List<ResponseItem> response;

	public void setResponse(List<ResponseItem> response){
		this.response = response;
	}

	public List<ResponseItem> getResponse(){
		return response;
	}
}