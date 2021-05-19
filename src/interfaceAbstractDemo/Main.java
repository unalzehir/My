package interfaceAbstractDemo;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Engin");
		customer.setLastName("Demiroð");
		customer.setNationalyId(123456);
		customer.setDateOfBirth(1993);
		
		baseCustomerManager.Save(customer);

	}

}

