package com.github.xuqplus.hello.mybatis3.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class B1Service implements BService {

	@Override
	public void a() {
		log.info("b1");
	}
}
