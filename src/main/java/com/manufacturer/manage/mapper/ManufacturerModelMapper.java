package com.manufacturer.manage.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.manufacturer.manage.entity.AddressEntity;
import com.manufacturer.manage.entity.ContactEntity;
import com.manufacturer.manage.entity.ManufacturerEntity;
import com.manufacturer.manage.model.AddressModel;
import com.manufacturer.manage.model.ContactModel;
import com.manufacturer.manage.model.ManufacturerModel;

@Component
public class ManufacturerModelMapper {
	public ManufacturerModel entityToManufacturerModel(ManufacturerEntity manufacturerEntity) {
		manufacturerEntity.setManufacturerId(manufacturerEntity.getManufacturerId());
		ManufacturerModel ManufacturerModel = new ManufacturerModel();
		BeanUtils.copyProperties(manufacturerEntity, ManufacturerModel);
		ManufacturerModel.setAddressModel(entityToAddressModel(manufacturerEntity.getAddressEntity()));
		ManufacturerModel.setContactModel(entityToContactModels(manufacturerEntity.getContactEntity()));
		return ManufacturerModel;

	}

	public AddressModel entityToAddressModel(AddressEntity addressEntity) {
		addressEntity.setAddressId(addressEntity.getAddressId());
		AddressModel AddressModel = new AddressModel();
		BeanUtils.copyProperties(addressEntity, AddressModel);
		return AddressModel;

	}

	public ContactModel entityToContactModel(ContactEntity contactEntity) {
		contactEntity.setContactId(contactEntity.getContactId());
		ContactModel ContactModel = new ContactModel();
		BeanUtils.copyProperties(contactEntity, ContactModel);
		return ContactModel;
	}

	public List<ContactModel> entityToContactModels(List<ContactEntity> contactEntities) {
		return contactEntities.stream().map(ContactEntity -> entityToContactModel(ContactEntity))
				.collect(Collectors.toList());
	}
}
