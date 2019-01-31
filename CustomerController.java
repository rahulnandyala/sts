package com.creativecx.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();			
	}
	
	@RequestMapping("/customers/{cid}")
	public Customer getMovie(@PathVariable("cid") String id){
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addMovie(@RequestBody Customer customer){
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
	public void updateMovie(@RequestBody Customer customer, @PathVariable String id){
		customerService.updateMovie(id, customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}")
	public void deleteCustomer(@PathVariable String id){
		customerService.deleteCustomer(id);
	}
}
