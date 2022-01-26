package com.ms.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Configuration
@ConfigurationProperties(prefix = "datasource")
@Data
public class DatasourceProperties {

	private String url;
	private String username;
	private String password;
	private String driverClassName;
	
	

}
