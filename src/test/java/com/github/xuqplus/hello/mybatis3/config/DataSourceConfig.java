package com.github.xuqplus.hello.mybatis3.config;

import com.zaxxer.hikari.HikariDataSource;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DataSourceConfig {

	@Bean
	@Autowired
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource hikariDataSource(Properties properties) {
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl(String.valueOf(properties.get("url")));
		ds.setJdbcUrl(String.valueOf(properties.get("username")));
		ds.setJdbcUrl(String.valueOf(properties.get("password")));
		return ds;
	}
}
