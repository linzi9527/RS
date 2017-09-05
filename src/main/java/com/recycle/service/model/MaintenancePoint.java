package com.recycle.service.model;

import com.summaryday.framework.a.Colum;
import com.summaryday.framework.a.Colum.ObjTypes;
import com.summaryday.framework.a.Key;
import com.summaryday.framework.a.Table;


@Table(name="r_s_maintenancepoint")
public class MaintenancePoint {

	@Key(isPrimary=true)
	@Colum(columName="mid",isNUll=false,type=ObjTypes.VARCHAR)
	private String mid;
	
	@Colum(columName="mname",isNUll=true,type=ObjTypes.VARCHAR)
	private String mname;
	
	@Colum(columName="maddress",isNUll=true,type=ObjTypes.VARCHAR)
	private String maddress;
	
	@Colum(columName="mimage",isNUll=true,type=ObjTypes.VARCHAR)
	private String mimage;
	
	@Colum(columName="mtype",isNUll=true,type=ObjTypes.INT)
	private int mtype;
	
	@Colum(columName="mcontent",isNUll=true,type=ObjTypes.VARCHAR)
	private String mcontent;
	
	@Colum(columName="mopenid",isNUll=true,type=ObjTypes.VARCHAR)
	private String mopenid;
	
	@Colum(columName="mprovince",isNUll=true,type=ObjTypes.VARCHAR)
	private String mprovince;
	
	@Colum(columName="mcity",isNUll=true,type=ObjTypes.VARCHAR)
	private String mcity;
	
	@Colum(columName="marea",isNUll=true,type=ObjTypes.VARCHAR)
	private String marea;
	
	@Colum(columName="mdate",isNUll=true,type=ObjTypes.VARCHAR)
	private String mdate;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public String getMimage() {
		return mimage;
	}
	public void setMimage(String mimage) {
		this.mimage = mimage;
	}
	public int getMtype() {
		return mtype;
	}
	public void setMtype(int mtype) {
		this.mtype = mtype;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public String getMopenid() {
		return mopenid;
	}
	public void setMopenid(String mopenid) {
		this.mopenid = mopenid;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	public String getMprovince() {
		return mprovince;
	}
	public void setMprovince(String mprovince) {
		this.mprovince = mprovince;
	}
	public String getMcity() {
		return mcity;
	}
	public void setMcity(String mcity) {
		this.mcity = mcity;
	}
	public String getMarea() {
		return marea;
	}
	public void setMarea(String marea) {
		this.marea = marea;
	}
	
	
	
	
}
