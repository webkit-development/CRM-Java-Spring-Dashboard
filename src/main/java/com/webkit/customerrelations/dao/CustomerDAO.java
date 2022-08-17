package com.webkit.customerrelations.dao;

import java.util.List;

import com.webkit.customerrelations.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
}
