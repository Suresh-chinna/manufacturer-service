package com.manufacturer.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manufacturer.manage.entity.ManufacturerEntity;
import com.manufacturer.manage.exception.ManufacturerNotFound;
import com.manufacturer.manage.mapper.ManufacturerEntityMapper;
import com.manufacturer.manage.mapper.ManufacturerModelMapper;
import com.manufacturer.manage.model.ManufacturerModel;
import com.manufacturer.manage.repository.ManufacturerDao;
import com.manufacturer.manage.service.ManufacturerService;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

	@Autowired
	private ManufacturerDao manufacturerDao;

	@Autowired
	private ManufacturerEntityMapper manufacturerEntityMapper;

	@Autowired
	private ManufacturerModelMapper manufacturerModelMapper;

	@Override
	public void createManufacturer(ManufacturerModel manufacturerModel) {
		manufacturerDao.save(manufacturerEntityMapper.modelToManufacturerEntity(manufacturerModel));
	}

	@Override
	public void updateManufacturer(ManufacturerModel manufacturerModel) {
		manufacturerDao.save(manufacturerEntityMapper.modelToManufacturerEntity(manufacturerModel));
	}

	@Override
	public void deleteByManufacturerId(int manufacturerId) {
		manufacturerDao.deleteById(manufacturerId);
	}

	@Override
	public ManufacturerModel findByManufacturerId(int manufacturerId) {
		ManufacturerModel manufacturerModel;
		Optional<ManufacturerEntity> manufacturerEntityOptional = manufacturerDao.findById(manufacturerId);
		if (manufacturerEntityOptional.isPresent()) {
			manufacturerModel = manufacturerModelMapper.entityToManufacturerModel(manufacturerEntityOptional.get());
		} else {
			throw new ManufacturerNotFound("manufacturer is not found for given manufactureId--->" + manufacturerId);
		}
		return manufacturerModel;
	}

}
