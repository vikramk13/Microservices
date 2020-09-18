
  package com.company.controller;
  
  import java.util.Optional;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PathVariable; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RestController;
  
  import com.company.model.Phone; import com.company.model.User; import
  com.company.userrepository.UserRepo;
  
  
  @RestController
  
  @RequestMapping("/api") 
  public class UserController {
  
  @Autowired
  private UserRepo repo;
  
  
  
	
	  @PostMapping("/createuser") 
	  public User create(@RequestBody User user) { 
		  
		 
	  
	  
	  return repo.save(user); 
	  }
	 
  
  @GetMapping("/getUser/{id}")
  public Optional<User> getUser(@PathVariable
  Integer id) {
  
  
  return repo.findById(id);
  
  }
  }
  
  
/*
 * @PostMapping("/createPhone") public Phone create(@RequestBody Phone phone) {
 * return repo.save(phone); }
 * 
 * 
 * 
 * }
 */