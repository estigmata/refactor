package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import movies.*;

class TestCustomer {
	private Customer customer;

	@Test
	void testCustomerName() {
		customer = new Customer("Customer Name");
		assertEquals(customer.getName(), "Customer Name");
	}
	
	@Test
	void testAmountFor() {
		customer = new Customer("Customer Name");
		Rental terminator = new Rental(new Movie("Terminator", 0), 2); 
		customer.addRental(terminator);
		assertEquals(customer.getAmountFor(terminator), 2.0);
	}

}
