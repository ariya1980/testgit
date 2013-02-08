package com.txn.service.utility.domain;

import java.util.Date;

public abstract class AbstractTransValue implements java.io.Serializable {
	
    private String  transValueId; 
    private String	transId; 
    private String	attrName; 
    private String	attrValue; 
    private String	dataType; 
    private Date	created; 
    private String	createdBy; 
    private Date	update; 
    private String	updateBy;
    
	public String getTransValueId() {
		return transValueId;
	}
	public void setTransValueId(String transValueId) {
		this.transValueId = transValueId;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	} 
    
    

}
