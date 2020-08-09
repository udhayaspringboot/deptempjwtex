package com.deptempjwtappln.dao;

 
  
  import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deptempjwtappln.model.User;
  
  
  
  
  
  public interface UserRepo extends JpaRepository<User, Integer> {
  
  
  Optional<User> findByUserName(String username);
  
  }
 