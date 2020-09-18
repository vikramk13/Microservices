package com.company.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.model.Phone;
import com.company.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	Phone save(Phone phone);

	

}
