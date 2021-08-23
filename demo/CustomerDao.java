package com.Milestone.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customers,Integer>
{

	static void saveAll(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}
