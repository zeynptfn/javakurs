package Entites;

import java.time.LocalDate;


import Abstruct.IEntity;

public class Customer implements IEntity{
	private int Id;	
	private String FirstName;
	private String LastName;
	private LocalDate DateofBirth;
	private String NationalityId;
	public Customer () {}
	public Customer(int id, String firstName, String lastName, LocalDate dateofBirth, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		NationalityId = nationalityId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
