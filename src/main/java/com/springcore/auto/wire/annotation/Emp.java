package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired  //for direct injection
	@Qualifier("address2")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired //for setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	//@Autowired //for constructor injection
	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
