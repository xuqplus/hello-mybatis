package com.github.xuqplus.hello.mybatis3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AServiceFactory {

	@Autowired
	List<AService> aServiceList;

	public void a() {
		for (AService aService : aServiceList) {
			aService.a();
		}
	}
}
