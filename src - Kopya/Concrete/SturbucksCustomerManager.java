package Concrete;

import Abstruct.BaseCustomerManager;
import Abstruct.ICustomerCheckService;
import Entites.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService _customerCheckService;
	
	public SturbucksCustomerManager(ICustomerCheckService _customerCheckService) {		
		this._customerCheckService = _customerCheckService;
		
	}
	
	@Override
	public void Save(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)==true) {
			System.out.println("Saved to db :" + customer.getFirstName());	
		}
		else {
			System.out.println("Not a valid person!");
		}
		
	}
	
	
	
	
	

}
