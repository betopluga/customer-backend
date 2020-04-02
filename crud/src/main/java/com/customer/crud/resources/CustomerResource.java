package com.customer.crud.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

import com.customer.crud.repository.*;
import com.customer.crud.models.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerRepository cr;

    @GetMapping(produces="application/json")
    public @ResponseBody Iterable<Customer> listCustomers() {
        Iterable<Customer> listaCustomers = cr.findAll();
        return listaCustomers;
    }

    @PostMapping
    public Customer insertCustomer (@RequestBody @Valid Customer customer) {    
        return cr.save(customer);
    }
    
    @DeleteMapping
    public Customer deleteCustomer(@RequestBody Customer customer){
        cr.delete(customer);
        return customer;
    }
    
}