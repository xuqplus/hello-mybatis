package com.github.xuqplus.hello.mybatis3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BServiceFactory {

	@Autowired
	List<BService> services;

	public void a() {
		for (BService service : services) {
			service.a();
		}
	}
}
