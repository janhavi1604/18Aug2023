package com.mybean;

public class Technician {

	

	public Technician() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technician(String technicianName, Device deviceName) {
		super();
		this.technicianName = technicianName;
		this.deviceName = deviceName;
	}
	private String technicianName;
	private Device deviceName;
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	public Device getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(Device deviceName) {
		this.deviceName = deviceName;
	}
	@Override
	public String toString() {
		return "Technician [technicianName=" + technicianName + ", deviceName=" + deviceName + "]";
	}
	
	



	
	
}
