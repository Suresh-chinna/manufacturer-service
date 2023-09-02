package com.manufacturer.manage.service;

import com.manufacturer.manage.model.ManufacturerModel;

public interface ManufacturerService {

	public void createManufacturer(ManufacturerModel manufacturerModel);

	public void updateManufacturer(ManufacturerModel manufacturerModel);

	public void deleteByManufacturerId(int manufacturerId);

	public ManufacturerModel findByManufacturerId(int manufacturerId);
}
