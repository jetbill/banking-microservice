package com.application.jetbill.account.repository;

import com.application.jetbill.account.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long>  {

    Optional<Customer> findByMobileNumber(String mobileNumber);
}
