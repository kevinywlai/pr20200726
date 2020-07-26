package com.fbtest.pr20200726.models;

import java.util.ArrayList;
import java.util.List;

public class City {
	private String cityName;
	
	private String cityCode;
	
	private List<Town> townList;

	public String getCityName() {
		return cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public List<Town> getTownList() {
		if(townList == null) {
			townList = new ArrayList<>();
		}
		return townList;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public void setTownList(List<Town> townList) {
		this.townList = townList;
	}
}
