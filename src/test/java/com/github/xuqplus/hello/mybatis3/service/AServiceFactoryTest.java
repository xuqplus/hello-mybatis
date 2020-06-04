package com.github.xuqplus.hello.mybatis3.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AServiceFactoryTest {

	@Autowired
	AServiceFactory aServiceFactory;
	@Autowired
	BServiceFactory bServiceFactory;
	@Autowired
	ServiceFactory serviceFactory;

	@Test
	void a() {
		aServiceFactory.a();
		bServiceFactory.a();
		serviceFactory.a();
	}
}