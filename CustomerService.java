package com.creativecx.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public Customer getCustomer(String id){
		return (Customer)customerRepository.findById(id).orElse(null);
	}
	
	public void addCustomer(Customer customer){
		customerRepository.save(customer);
	}

	public void updateMovie(String id, Customer customer) {
		customerRepository.save(customer);
		
	}

	public void deleteCustomer(String id) {
		customerRepository.deleteById(id);
	}
}
