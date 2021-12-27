package com.example.demo.exceptions;

/**
 * Creating custom Exception
 */
public class AddressBookException extends RuntimeException {

	public AddressBookException(String message) {
		super(message);
	}

}