package com.boa.kycprocess.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfiguration {

	@Value("${db_url}")
	private String url;
	@Value("${user}")
	private String username;
	@Value("${pass}")
	private String password;
	@Value("${driver}")
	private String driver;

	@Bean
	@ConditionalOnClass(DataSource.class)
	@Conditional(SqlConfiguration.class)
	public DataSource getInstance() {
		// @ConditionalOnmissingBean(type = "JpaTransaction*")
		// @ConditionalOnResource(resources = "classpath:propertieFileName")
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url(url);
		dataSourceBuilder.driverClassName(driver);
		dataSourceBuilder.password(password);
		dataSourceBuilder.username(username);
		return dataSourceBuilder.build();
	}

}
