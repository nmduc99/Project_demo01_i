package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
	@Query(value ="select * from Address",nativeQuery = true)
	public List<Address> getalladd();
	
	
}
