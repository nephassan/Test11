package com.example.test1.pojos.generaete_einvoice;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RefDtls{

	@SerializedName("InvRm")
	private String invRm;

	@SerializedName("ContrDtls")
	private List<ContrDtlsItem> contrDtls;

	@SerializedName("DocPerdDtls")
	private DocPerdDtls docPerdDtls;

	@SerializedName("PrecDocDtls")
	private List<PrecDocDtlsItem> precDocDtls;

	public void setInvRm(String invRm){
		this.invRm = invRm;
	}

	public String getInvRm(){
		return invRm;
	}

	public void setContrDtls(List<ContrDtlsItem> contrDtls){
		this.contrDtls = contrDtls;
	}

	public List<ContrDtlsItem> getContrDtls(){
		return contrDtls;
	}

	public void setDocPerdDtls(DocPerdDtls docPerdDtls){
		this.docPerdDtls = docPerdDtls;
	}

	public DocPerdDtls getDocPerdDtls(){
		return docPerdDtls;
	}

	public void setPrecDocDtls(List<PrecDocDtlsItem> precDocDtls){
		this.precDocDtls = precDocDtls;
	}

	public List<PrecDocDtlsItem> getPrecDocDtls(){
		return precDocDtls;
	}
}