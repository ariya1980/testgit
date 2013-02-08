package com.txn.service.utility.dao.impl;

import java.util.List;

import com.txn.service.utility.dao.BaseDAO;

public class BaseDAOImpl implements BaseDAO {

	@Override
	public List findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object data, Class classType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrUpdate(Object data, Class classType) {
		//found = update, not found = save
		return false;
	}
	
	
	

}
