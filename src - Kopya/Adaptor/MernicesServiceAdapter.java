package Adaptor;

import Abstruct.ICustomerCheckService;
import Entites.Customer;

public class MernicesServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
