package com.txn.service.utility.domain;

import java.sql.Timestamp;
import java.util.Date;

public abstract class AbstractEnhanceAct implements java.io.Serializable{
	
    private String  enhanceActId; 
    private String	enhanceId; 
    private String	actCommand; 
    private String	actExtTrans; 
    private String	actExtLogin; 
    private String	actSource; 
    private String	actDestination; 
    private String	actStatus; 
    private String	actNamespace; 
    private String	actExtCode; 
    private String	actExtDesc; 
    private String	actRemark; 
    private Timestamp	actReqDate; 
    private Timestamp	actResDate; 
    private Date	created; 
    private String	createdBy; 
    private Date	update; 
    private String	updateBy;
    

	public String getEnhanceActId() {
		return enhanceActId;
	}
	public void setEnhanceActId(String enhanceActId) {
		this.enhanceActId = enhanceActId;
	}
	public String getEnhanceId() {
		return enhanceId;
	}
	public void setEnhanceId(String enhanceId) {
		this.enhanceId = enhanceId;
	}
	public String getActCommand() {
		return actCommand;
	}
	public void setActCommand(String actCommand) {
		this.actCommand = actCommand;
	}
	public String getActExtTrans() {
		return actExtTrans;
	}
	public void setActExtTrans(String actExtTrans) {
		this.actExtTrans = actExtTrans;
	}
	public String getActExtLogin() {
		return actExtLogin;
	}
	public void setActExtLogin(String actExtLogin) {
		this.actExtLogin = actExtLogin;
	}
	public String getActSource() {
		return actSource;
	}
	public void setActSource(String actSource) {
		this.actSource = actSource;
	}
	public String getActDestination() {
		return actDestination;
	}
	public void setActDestination(String actDestination) {
		this.actDestination = actDestination;
	}
	public String getActStatus() {
		return actStatus;
	}
	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}
	public String getActNamespace() {
		return actNamespace;
	}
	public void setActNamespace(String actNamespace) {
		this.actNamespace = actNamespace;
	}
	public String getActExtCode() {
		return actExtCode;
	}
	public void setActExtCode(String actExtCode) {
		this.actExtCode = actExtCode;
	}
	public String getActExtDesc() {
		return actExtDesc;
	}
	public void setActExtDesc(String actExtDesc) {
		this.actExtDesc = actExtDesc;
	}
	public String getActRemark() {
		return actRemark;
	}
	public void setActRemark(String actRemark) {
		this.actRemark = actRemark;
	}
	public Timestamp getActReqDate() {
		return actReqDate;
	}
	public void setActReqDate(Timestamp actReqDate) {
		this.actReqDate = actReqDate;
	}
	public Timestamp getActResDate() {
		return actResDate;
	}
	public void setActResDate(Timestamp actResDate) {
		this.actResDate = actResDate;
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
