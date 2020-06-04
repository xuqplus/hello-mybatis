package com.github.xuqplus.hello.mybatis3.mapper;

import com.github.xuqplus.hello.mybatis3.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

	@Select("select * from app_user where name = #{name}")
	User getByName(String name);

	User getFirstByName(String name);
}
