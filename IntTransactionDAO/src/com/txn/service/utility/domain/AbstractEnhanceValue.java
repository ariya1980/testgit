package com.txn.service.utility.domain;

import java.util.Date;

public abstract class AbstractEnhanceValue implements java.io.Serializable {
	
    private String  enhanceValueId; 
    private String	enhanceId; 
    private String	attrName; 
    private String	attrValue; 
    private String	dataType; 
    private Date	created; 
    private String	createdBy; 
    private Date	update; 
    private String	updateBy;
    

	public String getEnhanceValueId() {
		return enhanceValueId;
	}
	public void setEnhanceValueId(String enhanceValueId) {
		this.enhanceValueId = enhanceValueId;
	}
	public String getEnhanceId() {
		return enhanceId;
	}
	public void setEnhanceId(String enhanceId) {
		this.enhanceId = enhanceId;
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
