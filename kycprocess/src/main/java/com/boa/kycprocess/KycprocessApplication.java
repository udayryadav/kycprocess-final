package com.boa.kycprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@EnableJpaRepositories(basePackages = {"com.boa.kycprocess.*"})
@EntityScan(basePackages = {"com.boa.kycprocess.*"})
public class KycprocessApplication {
 
	
	/*
	 * A single @SpringBootApplication annotation can be used to enable those three features, that is:

	@EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
	@ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
	@Configuration: allow to register extra beans in the context or import additional configuration classes

	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(KycprocessApplication.class, args);
	}

}
