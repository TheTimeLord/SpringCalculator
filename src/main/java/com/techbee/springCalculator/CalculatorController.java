package com.techbee.springCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@GetMapping("/{num1}plus{num2}")
	public double add(@PathVariable double num1, @PathVariable double num2) {
		return num1+num2;
	}
	
	@GetMapping("/{num1}minus{num2}")
	public double subtract(@PathVariable double num1, @PathVariable double num2) {
		return num1-num2;
	}
	
	@GetMapping("/{num1}times{num2}")
	public double multiply(@PathVariable double num1, @PathVariable double num2) {
		return num1*num2;
	}
	
	@GetMapping("/{num1}divide{num2}")
	public double division(@PathVariable double num1, @PathVariable double num2) {
		return num1/num2;
	}
}
