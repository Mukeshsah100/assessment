package com.Milestone.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public abstract class CustomerDaoServiceImp implements CustomerDaoService{
	@Autowired 
	private CustomerDao customerDao;
	@Override
	public List<Customers> retrieveAll()
	{
		return customerDao.findAll();			
	}
	@Override
	public Customers retrieveCustomer(int id)
	{
		return customerDao.getById(id);
		
	}
	public void deleteCustomer(int id)
	{
		Customers customer = null;
		try {
			customer = customerDao.getById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customerDao.delete(customer);	
	}
	public Customer updateCustomer(Customer customer)
	{
		CustomerDao.saveAll(customer);
		return customer;
	}
	public Customer addCustomer(Customer customer)
	{
		customerDao.saveAll(customer);
		return customer;
	}
	
	

}
