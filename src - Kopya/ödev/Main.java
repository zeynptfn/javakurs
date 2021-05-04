package ödev;

import java.time.LocalDate;

import Abstruct.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Entites.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager  baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1,"zeynep","tufan",LocalDate.of(2000, 10, 9),"288869"));
		CustomerCheckManager checkmanager = new CustomerCheckManager ();
		
	}

}
