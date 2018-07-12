package birthday.objects;

public class Client {
	
    private String lastName;
    private String firstName;
    private String birth;
    private String email;
    
    public Client() {
    }

	public Client(String lastName, String firstName, String birth, String email) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.birth = birth;
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", birth: " + birth + ", email: " + email;
    }



}
