package com.cloud.recycle.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.recycle.service.api.IProduct;
import com.recycle.service.model.Product;
import com.summaryday.framework.d.IBaseDao;
import com.summaryday.framework.db.SpringBeanHelper;

public class ProductServiceImpl implements IProduct {

	
	private Logger log=Logger.getLogger(ProductServiceImpl.class);
	
	private IBaseDao baseDao;
	
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> service_products(JSONObject obj) {
		// TODO 自动生成的方法存根
		Map<String,Object> map=new HashMap<String,Object>();
		int offset=0,rows=0;
		if(obj!=null){
			offset=obj.getInt("offset");
			  rows=obj.getInt("rows");
			String limit="limit "+offset+","+rows+" ";
			String sql="select * from r_s_product  order by pdate desc "+limit;
			try {
				baseDao=SpringBeanHelper.getBean("baseDao");
				List<Product> listgoods=(List<Product>) baseDao.query(Product.class, sql, false);
				int count=baseDao.QueryCount("from r_s_product");
				map.put("listproducts", listgoods);
				map.put("dataTotal", count);
			} catch (Exception e) {
				log.error("出现异常："+e);
			}
		}
		
		return map;
	}

}
