package Entities;

public class User implements Entity{
	private int id;
	private String FirstName;
	private String LastName;
	private String Mail;
	private String Password;
	private boolean ›sVerified;
	public User() {}
	
	public User(String mail, String password) {
		super();
		this.Mail = mail;
		this.Password = password;
	}
	public User(int id, String firstName, String lastName, String mail, String password, boolean isVerified) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Mail = mail;
		Password = password;
		›sVerified = isVerified;
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
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean is›sVerified() {
		return ›sVerified;
	}
	public void set›sVerified(boolean isVerified) {
		›sVerified = isVerified;
	}
	

}
