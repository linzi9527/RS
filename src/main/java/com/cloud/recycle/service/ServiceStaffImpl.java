package com.cloud.recycle.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.recycle.service.api.IServiceStaff;
import com.recycle.service.model.MaintenancePoint;
import com.summaryday.framework.d.IBaseDao;
import com.summaryday.framework.db.JsonUtil;
import com.summaryday.framework.db.SpringBeanHelper;

public class ServiceStaffImpl implements IServiceStaff {

	private Logger log=Logger.getLogger(ServiceStaffImpl.class);
	private IBaseDao baseDao;
	
	@SuppressWarnings("unchecked")
	public List<MaintenancePoint> list_service_store_info(MaintenancePoint mp) {
		// TODO 自动生成的方法存根
		List<MaintenancePoint> listmp=null;
		if(mp!=null){
			log.info("\n["+mp.getMid()+","+mp.getMname()+","+mp.getMaddress()+"]");
			int offset=0,rows=0;
			String limit="limit "+offset+","+rows+" ";
			baseDao=(IBaseDao)SpringBeanHelper.getBean("baseDao");
			String sql="select * from r_s_maintenancepoint where mprovince='"+mp.getMprovince()+"' and mcity='"+mp.getMcity()+"' and marea='"+mp.getMarea()+"' order by mdate desc "+limit;
			try {
				listmp=(List<MaintenancePoint>) baseDao.query(MaintenancePoint.class, sql, false);
			} catch (Exception e) {
				log.error("出现异常："+e);
			}
		}
		return listmp;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> service_store_info(JSONObject obj) {
		// TODO 自动生成的方法存根
		Map<String,Object> map=new HashMap<String,Object>();
		int offset=0,rows=0;
		if(obj!=null){
			offset=obj.getInt("offset");
			  rows=obj.getInt("rows");
			String limit="limit "+offset+","+rows+" ";
			baseDao=(IBaseDao)SpringBeanHelper.getBean("baseDao");
			String sql="select * from r_s_maintenancepoint where mprovince='"+obj.getString("mprovince")+"' and mcity='"+obj.getString("mcity")+"' and marea='"+obj.getString("marea")+"' order by mdate desc "+limit;
			try {
				List<MaintenancePoint> listmp=(List<MaintenancePoint>) baseDao.query(MaintenancePoint.class, sql, false);
				int count=baseDao.QueryCount("from r_s_maintenancepoint where mprovince='"+obj.getString("mprovince")+"' and mcity='"+obj.getString("mcity")+"' and marea='"+obj.getString("marea")+"'");
				map.put("listmp", listmp);
				map.put("dataTotal", count);
		
			} catch (Exception e) {
				log.error("出现异常："+e);
			}
		}
		return map;
	}

}
