package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.AddressBookDTO;
import com.example.demo.model.AddressBookData;
public interface IAddressBookService {

List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int id);
	
	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
	
	AddressBookData updateAddressBookData( int id,AddressBookDTO addressBookDTO);
	
	void deleteAddressBookData(int id);
}