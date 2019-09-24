package com.boa.kycprocess.configuration;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SqlConfiguration implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO
		String type = System.getProperty("dbType");
		return (type != null && type.equalsIgnoreCase("MYSQL"));
	}

}
