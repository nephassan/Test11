package com.example.test1.pojos.genertae_e;

import java.util.List;

public class RefDtls{
	private String invRm;
	private List<ContrDtlsItem> contrDtls;
	private DocPerdDtls docPerdDtls;
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