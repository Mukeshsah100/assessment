package com.Milestone.demo;

import java.util.List;

public interface CustomerDaoService {
	public List<Customer> retrieveAll();
	public Customer retrieveCustomer(int id);
	public void deleteCustomers(int id);
	public Customers addCustomer(Customers customer);
	public Customers updateCustomer(Customers customer);
	
}
