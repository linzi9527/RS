package com.recycle.service.api;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.recycle.service.model.MaintenancePoint;

public interface IServiceStaff {

	public List<MaintenancePoint> list_service_store_info(MaintenancePoint mp);
	
	public Map<String,Object> service_store_info(JSONObject obj);
}
