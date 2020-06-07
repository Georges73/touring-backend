package be.account.domain;

public class Account {
	
	private final int id;
	private final int accountNumber;
    private final String firstname;
    private final String lastname;
    private final int age;
    private final String email;
    
	public Account(int id, int accountNumber, String firstname, String lastname, int age, String email) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}
   

   

}
