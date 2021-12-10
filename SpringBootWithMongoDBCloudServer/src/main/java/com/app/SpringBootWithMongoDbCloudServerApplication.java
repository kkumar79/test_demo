package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithMongoDbCloudServerApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMongoDbCloudServerApplication.class, args);
		System.out.println("server is started");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer c1 = new Customer("1", "aaaa" , "bbbb");
		Customer c2 = new Customer("2", "gggg" , "mmm");
		Customer c3 = new Customer("3", "aasd" , "gfdgb");
		Customer c4 = new Customer("4", "fffa" , "bbcfgx");
		
		customerRepository.save(c1);
		customerRepository.save(c2);
		customerRepository.save(c3);
		customerRepository.save(c4);
		
		System.out.println("****************");
		
		List<Customer> customers = customerRepository.findAll();
		
		for (Customer c : customers) {
			System.out.println(c.toString());
		}
		
	}

}
