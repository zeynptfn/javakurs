package Google;

public class Mail {
	private String FirstName;
    private String LastName;
    private String Mail;
    private String Password;
    public Mail(String firstName, String lastName, String mail, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Mail = mail;
		Password = password;
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
	public Mail() {}
    

}
