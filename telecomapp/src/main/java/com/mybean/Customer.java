package com.mybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	

	public Customer(String customerName, String emailId, String mobileNo, ServicePlan service_plan) {
		super();
		this.customerName = customerName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.service_plan = service_plan;
	}
	private String customerName;
	private String emailId;
	private String mobileNo;
	
	@Autowired
	@Qualifier("service_plan2")
	private ServicePlan service_plan;
	//@Autowired
	public Customer(ServicePlan service_plan)
	{
		this.service_plan=service_plan;
		
	}
	public Customer()
	{
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public ServicePlan getService_plan() {
		return service_plan;
	}
	//@Autowired
	public void setService_plan(ServicePlan service_plan) {
		this.service_plan = service_plan;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ ", service_plan=" + service_plan + "]";
	}
	
	
	

}
