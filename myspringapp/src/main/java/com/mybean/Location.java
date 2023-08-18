package com.mybean;

public class Location {
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}

	private String locationName;

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + "]";
	}
	

}
