package com.txn.service.utility.domain;

import java.sql.Timestamp;
import java.util.Date;

public abstract class AbstractTrans implements java.io.Serializable {
	
    private String	transId; 
    private String	groupTransId; 
    private String	tmnAppId; 
    private String	reqTransId; 
    private String	servicesType; 
    private String	actionType ; 
    private String	channel; 
    private String	sof; 
    private String	sofGateway; 
    private String	paymentAmount; 
    private String	orderAmount; 
    private String	transStatus; 
    private String	currentState; 
    private String	respNamespace; 
    private String	respCode; 
    private String	respDesc; 
    private String	retryCounts; 
    private Timestamp	transReqDate; 
    private Timestamp	transRespDate; 
    private Date	created; 
    private String	createdBy; 
    private Date	update; 
    private String	updateBy;
    
    
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getGroupTransId() {
		return groupTransId;
	}
	public void setGroupTransId(String groupTransId) {
		this.groupTransId = groupTransId;
	}
	public String getTmnAppId() {
		return tmnAppId;
	}
	public void setTmnAppId(String tmnAppId) {
		this.tmnAppId = tmnAppId;
	}
	public String getReqTransId() {
		return reqTransId;
	}
	public void setReqTransId(String reqTransId) {
		this.reqTransId = reqTransId;
	}
	public String getServicesType() {
		return servicesType;
	}
	public void setServicesType(String servicesType) {
		this.servicesType = servicesType;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getSof() {
		return sof;
	}
	public void setSof(String sof) {
		this.sof = sof;
	}
	public String getSofGateway() {
		return sofGateway;
	}
	public void setSofGateway(String sofGateway) {
		this.sofGateway = sofGateway;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public String getRespNamespace() {
		return respNamespace;
	}
	public void setRespNamespace(String respNamespace) {
		this.respNamespace = respNamespace;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	public String getRetryCounts() {
		return retryCounts;
	}
	public void setRetryCounts(String retryCounts) {
		this.retryCounts = retryCounts;
	}
	public Timestamp getTransReqDate() {
		return transReqDate;
	}
	public void setTransReqDate(Timestamp transReqDate) {
		this.transReqDate = transReqDate;
	}
	public Timestamp getTransRespDate() {
		return transRespDate;
	}
	public void setTransRespDate(Timestamp transRespDate) {
		this.transRespDate = transRespDate;
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
