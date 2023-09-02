package com.manufacturer.manage.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class ManufacturerModel {

	private int manufacturerId;

	@NotBlank(message = "company name should be not null")
	private String companyname;

	@NotBlank(message = "description should be not null")
	private String description;
	private String registrationNumber;
	private LocalDate registrationDate;

	private AddressModel addressModel;
	private List<ContactModel> contactModel;

	public ManufacturerModel() {
		super();
	}

	public ManufacturerModel(int manufacturerId,
			@NotBlank(message = "company name should be not null") String companyname,
			@NotBlank(message = "description should be not null") String description, String registrationNumber,
			LocalDate registrationDate, AddressModel addressModel, List<ContactModel> contactModel) {
		super();
		this.manufacturerId = manufacturerId;
		this.companyname = companyname;
		this.description = description;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.addressModel = addressModel;
		this.contactModel = contactModel;
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

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public List<ContactModel> getContactModel() {
		return contactModel;
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

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	public void setContactModel(List<ContactModel> contactModel) {
		this.contactModel = contactModel;
	}

	@Override
	public String toString() {
		return "ManufacturerModel [manufacturerId=" + manufacturerId + ", companyname=" + companyname + ", description="
				+ description + ", registrationNumber=" + registrationNumber + ", registrationDate=" + registrationDate
				+ ", addressModel=" + addressModel + ", contactModel=" + contactModel + "]";
	}

}
