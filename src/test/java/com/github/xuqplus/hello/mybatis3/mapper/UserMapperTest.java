package com.github.xuqplus.hello.mybatis3.mapper;

import com.github.xuqplus.hello.mybatis3.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class UserMapperTest {

	@Autowired
	UserMapper userMapper;

	@Test
	void save() {
		User user = new User();
		user.setId(3L);
		user.setName("xqq");
		user.setWorkCity("sh");
		user.setIndex(1);
		userMapper.insert(user);
	}

	@Test
	void test() {
		User xqq = userMapper.getFirstByName("xqq");
		log.info("{}", xqq);

		User user = userMapper.selectByPrimaryKey(3L);
		log.info("{}", user);
	}

	@Test
	void test2() {
		User xqq = userMapper.getByName("xqq");
		log.info("{}", xqq);
	}
}