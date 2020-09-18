package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.model.Phone;
import com.company.model.User;
import com.company.userrepository.UserRepo;

@SpringBootApplication
public class HibernateOneToOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateOneToOneApplication.class, args);
	}

	@Autowired
	private UserRepo repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		User user1 =new User();
		user1.setFirstName("vinay ");
		user1.setLastName("redd");
		
		
		Phone p=new Phone();
		p.setPhoneNumber(9885565531L);
		
		user1.setPhone(p);
		p.setUser(user1);
		
		
		repo.save(user1);
		
		
		// TODO Auto-generated method stub
		
	}

}
