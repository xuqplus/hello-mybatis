package com.github.xuqplus.hello.mybatis3.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class A1Service implements AService {

	@Override
	public void a() {
		log.info("a1");
	}
}
