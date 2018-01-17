package com.rentingService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class CarRentingController {
	
	private List<Car> listOfCars = new ArrayList<Car>();
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Car> listOfCars(){
		return listOfCars;
	}

	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addCar(@RequestBody Car car) throws Exception{
		listOfCars.add(car);
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteCar(@RequestParam(value="plateNumber", required=false) String plateNumber) throws Exception{
	}

	
}
