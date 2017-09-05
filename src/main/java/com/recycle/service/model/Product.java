package com.recycle.service.model;

import com.summaryday.framework.a.Colum;
import com.summaryday.framework.a.Key;
import com.summaryday.framework.a.Table;
import com.summaryday.framework.a.Colum.ObjTypes;

@Table(name="r_s_product")
public class Product {

	@Key(isPrimary=true)
	@Colum(columName="pid",isNUll=false,type=ObjTypes.VARCHAR)
	private String pid;
	
	@Colum(columName="ptitle",isNUll=true,type=ObjTypes.VARCHAR)
	private String ptitle;
	
	@Colum(columName="pimage",isNUll=true,type=ObjTypes.VARCHAR)
	private String pimage;
	
	@Colum(columName="pprice",isNUll=true,type=ObjTypes.VARCHAR)
	private String pprice;
	
	@Colum(columName="ppostfee",isNUll=true,type=ObjTypes.VARCHAR)
	private String ppostfee;
	
	@Colum(columName="psales",isNUll=true,type=ObjTypes.VARCHAR)
	private String psales;
	
	@Colum(columName="pdate",isNUll=true,type=ObjTypes.VARCHAR)
	private String pdate;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPtitle() {
		return ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPpostfee() {
		return ppostfee;
	}

	public void setPpostfee(String ppostfee) {
		this.ppostfee = ppostfee;
	}

	public String getPsales() {
		return psales;
	}

	public void setPsales(String psales) {
		this.psales = psales;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	
	
	
	
}
