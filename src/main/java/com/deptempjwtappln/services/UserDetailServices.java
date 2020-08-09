/*
 * package com.deptempjwtappln.services;
 * 
 * import java.util.ArrayList; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.deptempjwtappln.dao.UserRepo; import
 * com.deptempjwtappln.model.User;
 * 
 * @Service public class UserDetailServices implements UserDetailsService{
 * 
 * @Autowired
 * 
 * //UserRepo userRepo;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException {
 * 
 * //Optional<User> use = userRepo.findByUserName(username);
 * 
 * return new User("admin","admin",new ArrayList<>()); }
 * 
 * }
 */