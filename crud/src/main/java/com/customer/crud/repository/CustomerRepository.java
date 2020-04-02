package com.customer.crud.repository;

import com.customer.crud.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}