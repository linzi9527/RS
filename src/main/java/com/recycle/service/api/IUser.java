package com.recycle.service.api;

import com.recycle.service.model.Account;

/**
 * 处理系统各端登录接口
 * @author Administrator
 *
 */
public interface IUser {

	public boolean login(Account user);
	
	public boolean pc_login(String username,String password);
	
	public boolean phone_login(String userphone,String password);
	
	public boolean wx_login(String openId);
	
	//public User wx_login(String openId); //返回实名制对象
}
