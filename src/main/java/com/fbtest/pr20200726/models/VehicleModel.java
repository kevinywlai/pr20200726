package com.fbtest.pr20200726.models;

import java.util.ArrayList;
import java.util.List;

public class VehicleModel {

	private List<VehicleType> vehicleTypeList;
	
	private List<City> cityList;

	public List<VehicleType> getVehicleTypeList() {
		if(vehicleTypeList == null) {
			vehicleTypeList = new ArrayList<>();
		}
		return vehicleTypeList;
	}

	public List<City> getCityList() {
		if(cityList == null) {
			cityList = new ArrayList<>();
		}
		return cityList;
	}

	public void setVehicleTypeList(List<VehicleType> vehicleTypeList) {
		this.vehicleTypeList = vehicleTypeList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
}
