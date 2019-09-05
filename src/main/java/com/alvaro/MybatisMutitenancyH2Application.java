package com.alvaro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MybatisMutitenancyH2Application {

	public static void main(String[] args) {
		SpringApplication.run(MybatisMutitenancyH2Application.class, args);
	}
	
	
	@Configuration
	@EnableWebSecurity
	public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf()
				.disable()
				.authorizeRequests()
				.antMatchers("/**")
				.permitAll()
				.anyRequest()
				.authenticated();
		}
	}

}
