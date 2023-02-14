package com.swathi.jpasecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.swathi.jpasecurity.model.MyUserDetails;
import com.swathi.jpasecurity.model.User;
import com.swathi.jpasecurity.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username);
		
		if(null == user)
			throw new UsernameNotFoundException("User " + username + " not found");
		
		return new MyUserDetails(user);
	}

}
