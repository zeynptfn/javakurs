package Abstruct;

import Entites.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("save to db"+ customer.getFirstName());
		
	}

	

	
		
	

}
