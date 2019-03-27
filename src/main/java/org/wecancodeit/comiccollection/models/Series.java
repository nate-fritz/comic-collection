package org.wecancodeit.comiccollection.models;

import javax.persistence.Embeddable;

@Embeddable
public class Series {
	
	private String firstName;
	private String lastName;
	
	public Series() {}

	public Series(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Creator [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
