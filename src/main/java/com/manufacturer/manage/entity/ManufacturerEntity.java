package com.manufacturer.manage.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "manufacturer", schema = "manufacturer_schema")
public class ManufacturerEntity {

	@Id
	@Column(name = "manufacturer_id")
	private int manufacturerId;

	@Column(name = "company_name")
	private String companyname;

	private String description;

	@Column(name = "registration_number")
	private String registrationNumber;

	@Column(name = "registration_date")
	private LocalDate registrationDate;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	private AddressEntity addressEntity;

	@JsonManagedReference("manufacturer-contact")
	@OneToMany(mappedBy = "manufacturerEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ContactEntity> contactEntity;

	public ManufacturerEntity() {
		super();
	}

	public ManufacturerEntity(int manufacturerId, String companyname, String description, String registrationNumber,
			LocalDate registrationDate, AddressEntity addressEntity, List<ContactEntity> contactEntity) {
		this.manufacturerId = manufacturerId;
		this.companyname = companyname;
		this.description = description;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.addressEntity = addressEntity;
		this.contactEntity = contactEntity;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public String getCompanyname() {
		return companyname;
	}

	public String getDescription() {
		return description;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public List<ContactEntity> getContactEntity() {
		return contactEntity;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public void setContactEntity(List<ContactEntity> contactEntity) {
		this.contactEntity = contactEntity;
	}

}
