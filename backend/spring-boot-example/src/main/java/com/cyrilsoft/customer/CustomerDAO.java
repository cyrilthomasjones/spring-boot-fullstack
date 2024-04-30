package com.cyrilsoft.customer;

import java.util.Optional;
import java.util.List;

public interface CustomerDAO {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer Id);
    void insertCustomer(Customer customer);
    boolean existsPersonWithEmail(String email);
    boolean existsPersonWithId(Integer Id);
    void deleteCustomerById(Integer customerId);
    void updateCustomer(Customer update);
}
