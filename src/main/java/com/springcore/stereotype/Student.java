package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("prototype") // "singleton" by default
// prototype scope
// for xml <bean class="" name="" scope="" />
public class Student {
	@Value("Ishaan Vadhan")
	private String name;
	@Value("Pune")
	private String city;
	@Value("#{temp}")
	private List<String> addresses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", addresses=" + addresses + "]";
	}

}
