package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
import com.example.demo.model.UserAddress;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getall();
	
	
	@Query(value = "select a.id, u.username, u.password, a.city "
			+ " from user u inner join address a on  u.id= a.user_id ",
			nativeQuery = true)
	public List<UserAddress>  getAllUserAddress();
	

}
