package com.manufacturer.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manufacturer.manage.model.ManufacturerModel;
import com.manufacturer.manage.service.ManufacturerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/manufacturer")
public class ManufacturerController {

	@Autowired
	private ManufacturerService manufacturerService;

	@PostMapping("/create")
	public void createManufacturer(@Valid @RequestBody ManufacturerModel manufacturerModel) {
		manufacturerService.createManufacturer(manufacturerModel);
	}

	@PutMapping("/update")
	public void updateManufacturer(@Valid @RequestBody ManufacturerModel manufacturerModel) {
		manufacturerService.updateManufacturer(manufacturerModel);
	}

	@DeleteMapping("/deleteByManufacturerId/{manufacturerId}")
	public void deleteByManufacturerId(@PathVariable int manufacturerId) {
		manufacturerService.deleteByManufacturerId(manufacturerId);
	}

	@GetMapping("/findByManufacturerId/{manufacturerId}")
	public ManufacturerModel findByManufacturerId(@PathVariable int manufacturerId) {
		return manufacturerService.findByManufacturerId(manufacturerId);
	}
}
