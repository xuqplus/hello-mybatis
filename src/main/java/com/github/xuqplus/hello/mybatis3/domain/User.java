package com.github.xuqplus.hello.mybatis3.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "app_user")
public class User implements Serializable {

	@Id
	private Long id;
	private String name;
	@Column(name = "workCity")
	private String workCity;
	@Column(name = "index0")
	private Integer index;
}
