package com.cloud.recycle.service;

import org.apache.log4j.Logger;

import com.recycle.service.api.IUser;
import com.recycle.service.model.Account;
import com.recycle.service.model.User;
import com.summaryday.framework.d.IBaseDao;
import com.summaryday.framework.db.SpringBeanHelper;

public class UserServiceImpl implements IUser {
	
	private Logger log=Logger.getLogger(UserServiceImpl.class);
	private IBaseDao baseDao;
	
	public boolean login(Account user) {
		// TODO 自动生成的方法存根
		baseDao=SpringBeanHelper.getBean("baseDao");
		String sql=" where userphone='"+user.getUserphone()+"'  and password='"+user.getPassword()+"'  ";
		try {
			User u=(User) baseDao.load(User.class, sql, false);
			if(null!=u){
				log.info("\n["+u.getPostname()+","+u.getUsername()+","+u.getUserphone()+"]");
				return true;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			//e.printStackTrace();
			log.error("登录验证异常："+e);
		}
		return false;
	}

	public boolean pc_login(String username, String password) {
		// TODO 自动生成的方法存根
		baseDao=SpringBeanHelper.getBean("baseDao");
		String sql=" where userphone='"+username+"'  and password='"+password+"'  ";
		try {
			User u=(User) baseDao.load(User.class, sql, false);
			if(null!=u){
				log.info("\nPC-["+u.getPostname()+","+u.getUsername()+","+u.getUserphone()+"]");
				return true;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			//e.printStackTrace();
			log.error("PC登录验证异常："+e);
		}
		return false;
	}

	public boolean phone_login(String phoneNo, String password) {
		// TODO 自动生成的方法存根
		baseDao=SpringBeanHelper.getBean("baseDao");
		String sql=" where userphone='"+phoneNo+"'  and password='"+password+"'  ";
		try {
			User u=(User) baseDao.load(User.class, sql, false);
			if(null!=u){
				log.info("\nPhone-["+u.getPostname()+","+u.getUsername()+","+u.getUserphone()+"]");
				return true;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			//e.printStackTrace();
			log.error("Phone登录验证异常："+e);
		}
		return false;
	}

	public boolean wx_login(String openId) {
		// TODO 自动生成的方法存根
		baseDao=SpringBeanHelper.getBean("baseDao");
		String sql=" where openid='"+openId+"' ";
		try {
			User u=(User) baseDao.load(User.class, sql, false);
			if(null!=u){
				log.info("\nWX-["+u.getPostname()+","+u.getUsername()+","+u.getUserphone()+"]");
				return true;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			//e.printStackTrace();
			log.error("WX登录验证异常："+e);
		}
		return false;
	}

	

}
