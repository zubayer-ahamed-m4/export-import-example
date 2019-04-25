package com.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderslab.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
