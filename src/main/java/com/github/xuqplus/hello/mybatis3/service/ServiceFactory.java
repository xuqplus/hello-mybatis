package com.github.xuqplus.hello.mybatis3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFactory {

	@Autowired
	List<AService> aServices;
	@Autowired
	List<BService> bServices;

	public void a() {
		for (AService service : aServices) {
			service.a();
		}
		for (BService service : bServices) {
			service.a();
		}
	}
}
