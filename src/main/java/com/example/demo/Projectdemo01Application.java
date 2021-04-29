package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class Projectdemo01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Projectdemo01Application.class, args);
		
		
	}
	@Autowired
	UserRepository userpo;
	
	@Autowired
	AddressRepository addrepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		addrepo.getalladd().forEach(item ->{
			System.out.println(item);
		});
		System.out.println("-----------------------------------------------------------");
		addrepo.findByNameLike("%t%").forEach(item ->{
			System.out.println(item);
		});
		System.out.println("-----------------------------------------------------------");
		userpo.getall().forEach(item->{
			System.out.println(item);
		});
		
		System.out.println("-----------------------------------------------------------");

		userpo.getAllUserAddress().forEach(item -> {
			System.out.println(item.getId() + '-' +item.getUsername()+'-'
					 + item.getCity());
		});
		
		
	
	}

}
