package com.SunbaseData.demo.Sunbase.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SunbaseData.demo.Sunbase.model.Customer;
import com.SunbaseData.demo.Sunbase.repository.CustomerRepository;

import java.util.Collections;

	@Service
	public class MyUserDetailsService implements UserDetailsService {

	    @Autowired
	    private CustomerRepository customerRepository;

	    @Override
	    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	        Customer customer = customerRepository.findByEmail(email);

	        if (customer == null) {
	            throw new UsernameNotFoundException("User not found with email: " + email);
	        }

	        // Use the fully qualified User class from org.springframework.security.core.userdetails
	        return new org.springframework.security.core.userdetails.User(
	                customer.getEmail(), customer.getPassword(), Collections.emptyList()
	        );
	    }
	}















