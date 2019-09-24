package com.boa.kycprocess.configuration;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NoSqlConfiguration implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		String type = System.getProperty("MONGODB");
		return (type != null && type.equalsIgnoreCase("MONGODB"));
	}

}
