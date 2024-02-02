package com.SunbaseData.demo.Sunbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SunbaseData.demo.Sunbase.model.Customer;

import controller.CustomerSyncController;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String email);

	Customer save(CustomerSyncController customerSync);
}
