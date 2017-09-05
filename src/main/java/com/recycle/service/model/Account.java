package com.recycle.service.model;

import java.io.Serializable;

import com.summaryday.framework.a.Colum;
import com.summaryday.framework.a.Key;
import com.summaryday.framework.a.Table;
import com.summaryday.framework.a.Colum.ObjTypes;


@SuppressWarnings("serial")
@Table(name="r_wx_account")
public class Account implements Serializable{

	@Key(isPrimary=true)
	@Colum(columName="id",isNUll=false,type=ObjTypes.STRING)
	private String id;
	
	@Colum(columName="openid",isNUll=false,type=ObjTypes.STRING)
	private String openid;
	
	@Colum(columName="nickname",isNUll=false,type=ObjTypes.STRING)
	private String nickname;
	
	@Colum(columName="header",isNUll=false,type=ObjTypes.STRING)
	private String header;
	
	@Colum(columName="address",isNUll=false,type=ObjTypes.STRING)
	private String address;
	
	@Colum(columName="usertype",isNUll=false,type=ObjTypes.STRING)
	private String usertype;
	
	@Colum(columName="realname",isNUll=false,type=ObjTypes.STRING)
	private String realname;
	
	@Colum(columName="cardno",isNUll=false,type=ObjTypes.STRING)
	private String cardno;
	
	@Colum(columName="userphone",isNUll=false,type=ObjTypes.STRING)
	private String userphone;
	
	@Colum(columName="password",isNUll=false,type=ObjTypes.STRING)
	private String password;
	
	@Colum(columName="integraltotal",isNUll=false,type=ObjTypes.INT)
	private Integer integraltotal;
	
	@Colum(columName="wxupdate",isNUll=false,type=ObjTypes.STRING)
	private String wxupdate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIntegraltotal() {
		return integraltotal;
	}

	public void setIntegraltotal(Integer integraltotal) {
		this.integraltotal = integraltotal;
	}

	public String getWxupdate() {
		return wxupdate;
	}

	public void setWxupdate(String wxupdate) {
		this.wxupdate = wxupdate;
	}
	
	
}
