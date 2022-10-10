package com.pragrank.security.config;
import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
	
	  @Bean 
	  public UserDetailsService userDetailsService()
	  {
		  var ud=new
	  InMemoryUserDetailsManager(); var user=
	  User.withUsername("pragrank").password("123").authorities("read").build();
	  ud.createUser(user);
	  return ud;
	  }
	  
	  @Bean
	  public PasswordEncoder passwordEncoder() {
		  return NoOpPasswordEncoder.getInstance();
		  
	  }
	 
}
