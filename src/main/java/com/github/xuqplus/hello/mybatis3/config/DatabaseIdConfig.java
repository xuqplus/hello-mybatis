package com.github.xuqplus.hello.mybatis3.config;

import java.util.Properties;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseIdConfig {

	@Bean
	public DatabaseIdProvider getDatabaseIdProvider() {
		DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
		Properties properties = new Properties();
		properties.setProperty("MySQL", "mysql");
		properties.setProperty("Oracle", "oracle");
		properties.setProperty("SQL Server", "mssql");
		databaseIdProvider.setProperties(properties);
		return databaseIdProvider;
	}
}
