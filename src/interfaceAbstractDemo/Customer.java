package interfaceAbstractDemo;



public class Customer implements IEntity {

	int id;
	String firstName;
	String lastName;
	int dateOfBirth;
	long nationalyId;
	
	public Customer() {};
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalyId = nationalyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getNationalyId() {
		return nationalyId;
	}

	public void setNationalyId(long nationalyId) {
		this.nationalyId = nationalyId;
	}
}
