package com.fbtest.pr20200726.services;

import org.springframework.stereotype.Service;

import com.fbtest.pr20200726.models.City;
import com.fbtest.pr20200726.models.Town;
import com.fbtest.pr20200726.models.VehicleModel;
import com.fbtest.pr20200726.models.VehicleType;

@Service
public class VehicleMapService {

	public void mapModel(VehicleModel vehicleModel){
		
		//cityList
		Town xinyi = new Town();
		xinyi.setTownCode("110");
		xinyi.setTownName("信義區");
		
		Town neihu = new Town();
		neihu.setTownCode("114");
		neihu.setTownName("內湖區");
		
		City taipei = new City();
		taipei.setCityCode("taipei");
		taipei.setCityName("台北市");
		taipei.getTownList().add(xinyi);
		taipei.getTownList().add(neihu);
		
		Town xizhi = new Town();
		xizhi.setTownCode("221");
		xizhi.setTownName("汐止區");
		
		Town pingxi = new Town();
		pingxi.setTownCode("226");
		pingxi.setTownName("平溪區");
		
		City newtaipei = new City();
		newtaipei.setCityCode("newtaipei");
		newtaipei.setCityName("新北市");
		newtaipei.getTownList().add(xizhi);
		newtaipei.getTownList().add(pingxi);
		
		vehicleModel.getCityList().add(taipei);
		vehicleModel.getCityList().add(newtaipei);
		
		//vehicleTypeList
		VehicleType type01 = new VehicleType();
		type01.setTypeCode("01");
		type01.setTypeName("普通重型機車");
		
		VehicleType type02 = new VehicleType();
		type02.setTypeCode("02");
		type02.setTypeName("輕型機車");		
		
		VehicleType type32 = new VehicleType();
		type32.setTypeCode("32");
		type32.setTypeName("大型重型機車");	
		
		vehicleModel.getVehicleTypeList().add(type01);
		vehicleModel.getVehicleTypeList().add(type02);
		vehicleModel.getVehicleTypeList().add(type32);
	}
}
