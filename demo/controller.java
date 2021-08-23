package com.Milestone.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	private CustomerDaoService service;
	@GetMapping("/Customers")
	public List<Customer> retriveAll()
	{return service.retrieveAll();
	
		
	}
	@GetMapping("employees/{id}")
	public Customer retrieveCustomer(@PathVariable int id)
	{
		return service.retrieveCustomer(id);
	}
	@DeleteMapping("/Customers/{id}")
	public ResponseEntity<HttpStatus> deleteCustomer (@PathVariable int id) {
	
	try {
		service.deleteCustomers(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}catch (Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	@PostMapping("/Customers")
	public Customers addCustomers(@RequestBody Customers customer)
	{
		return service.addCustomer(customer);
	}
	
	@PutMapping("/Customers")
	public Customers updateCustomers(@RequestBody Customers customer)
	{
		return service.updateCustomer(customer);
	}

}
