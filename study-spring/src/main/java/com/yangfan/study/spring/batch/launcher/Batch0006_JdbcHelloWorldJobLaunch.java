package com.yangfan.study.spring.batch.launcher;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Batch0006_JdbcHelloWorldJobLaunch {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/yangfan/study/spring/batch/applicationContext.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jdbcJobLauncher");
		
		/*
		6.jdbc hello world
		*/
		Job job = (Job) context.getBean("jdbcHelloWorldJob");
		
		try {
			Map<String, JobParameter> params = new HashMap<String, JobParameter>();
			params.put("jdbcHelloWorldJob", new JobParameter(new Date()));
			
			// 运行Job
			JobExecution result = launcher.run(job, new JobParameters(params));
			// 处理结束， 控制台打印处理结果
			System.out.println(result.toString());
			
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
