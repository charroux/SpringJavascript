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

	@RequestMapping(value = "/cars/{index}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Car getCar( @PathVariable(value="index") int index){
		Car car = listOfCars.get(index);
		System.out.println("car=" + car);
		return car;
	}

	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addCar(@RequestBody Car car) throws Exception{
		System.out.println(car);
		listOfCars.add(car);
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateCar(@RequestBody Car car) throws Exception{
		System.out.println(car);
		int i=0;
		while(i<listOfCars.size() && listOfCars.get(i).getPlateNumber().equals(car.getPlateNumber())==false){
			i++;
		}
		if(i<listOfCars.size()){
			listOfCars.remove(i);
			listOfCars.add(i, car);
		}
	}

/*	@RequestMapping(value = "/cars", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateCar(@RequestBody Car car, @RequestParam(value="plateNumber", required=true) String  plateNumber) throws Exception{
		System.out.println(car);
		listOfCars.add(car);
	}
	
	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateCar1(@RequestBody Car car, @PathVariable(value="plateNumber") String  plateNumber) throws Exception{
		System.out.println(car);
		listOfCars.add(car);
	}*/
}
