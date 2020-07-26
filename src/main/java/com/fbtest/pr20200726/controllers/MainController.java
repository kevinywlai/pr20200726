package com.fbtest.pr20200726.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fbtest.pr20200726.models.VehicleModel;
import com.fbtest.pr20200726.services.VehicleMapService;

@Controller
public class MainController {
	
	@Autowired
	VehicleMapService vehicleMap;
	
	@RequestMapping("/main")
	public String goMain(Model model) throws JsonProcessingException {
		
		VehicleModel vehicleModel = new VehicleModel();
		vehicleMap.mapModel(vehicleModel);
		
		// JSon Format
		ObjectMapper mapper = new ObjectMapper();
		model.addAttribute("vehicleModelJson",mapper.writeValueAsString(vehicleModel));
		
		//vehicleModel.getVehicleTypeList().forEach(i -> System.out.println("type:" + i.getTypeCode()) );
		
		return "main";
	}
}
