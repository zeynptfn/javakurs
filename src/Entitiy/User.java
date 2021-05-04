package Entitiy;

import java.time.LocalDate;

public class User {
	private int id;
	private String FirstName;
	private String LastName;
	private LocalDate DateOfBirth;
	private String NatiolanIdentitiy;
	
	public User () {}

	public User(int id, String firstName, String lastName, LocalDate dateOfBirth, String natiolanIdentitiy) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NatiolanIdentitiy = natiolanIdentitiy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNatiolanIdentitiy() {
		return NatiolanIdentitiy;
	}

	public void setNatiolanIdentitiy(String natiolanIdentitiy) {
		NatiolanIdentitiy = natiolanIdentitiy;
	}
	

}
