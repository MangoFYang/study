package com.yangfan.study.spring.batch.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
