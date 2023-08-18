package com.mybean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class ServicePlan {
	public ServicePlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServicePlan(String planName, String validityDays, String price) {
		super();
		this.planName = planName;
		this.validityDays = validityDays;
		this.price = price;
	}

	private String planName;
	private String validityDays;
	private String price;
	
	@Resource
	@Qualifier("mydbinfo1")
	private MyDbInfo myDbInfo;
	
	

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getValidityDays() {
		return validityDays;
	}

	public void setValidityDays(String validityDays) {
		this.validityDays = validityDays;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ServicePlan [planName=" + planName + ", validityDays=" + validityDays + ", price=" + price + "]";
	}
	
	@PostConstruct
	public void beancreadted()
	{
		System.out.println("bean created");
	}
	
	@PreDestroy
	public void beandestroyed()
	{
		System.out.println("bean destroyed");
	}

	public MyDbInfo getMyDbInfo() {
		return myDbInfo;
	}

	public void setMyDbInfo(MyDbInfo myDbInfo) {
		this.myDbInfo = myDbInfo;
	}
	

}
