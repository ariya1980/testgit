package com.txn.service.utility.dao;

import java.util.List;

public interface BaseDAO {

		public List findByProperty(String propertyName, Object value);
	    public boolean delete(Object data,Class className);
	    public boolean saveOrUpdate(Object data,Class className);

}
