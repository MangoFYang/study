package com.yangfan.study.spring.batch.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.yangfan.study.spring.batch.model.Student;

@Repository
public class StudentDao extends BaseDao {

	public void saveStudent(final Student student) {
		this.getJdbcTemplate().update(
			"insert into student (ID, name, age, score) values(?, ?, ?, ?)", 
			new PreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement ps)
						throws SQLException {
					ps.setString(1, student.getID());
					ps.setString(2, student.getName());
					ps.setInt(3, student.getAge());
					ps.setFloat(4, student.getScore());
				}
			});
	}
	
}
