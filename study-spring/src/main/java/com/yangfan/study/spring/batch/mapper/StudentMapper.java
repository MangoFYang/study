package com.yangfan.study.spring.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.yangfan.study.spring.batch.model.Student;

public class StudentMapper implements FieldSetMapper<Student> {

	@Override
	public Student mapFieldSet(FieldSet fieldSet) throws BindException {
		Student s = new Student();
		s.setID(fieldSet.readString(0));
		s.setName(fieldSet.readString(1));
		s.setAge(fieldSet.readInt(2));
		s.setScore(fieldSet.readInt(3));
		return s;
	}

}
