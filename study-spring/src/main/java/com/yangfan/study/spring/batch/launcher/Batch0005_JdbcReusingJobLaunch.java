package com.yangfan.study.spring.batch.launcher;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Batch0005_JdbcReusingJobLaunch {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/yangfan/study/spring/batch/applicationContext.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jdbcJobLauncher");
		
		/*
		4.CSV文件读取，写入数据库中
		*/
		Job job = (Job) context.getBean("jdbcReusingJob");
		
		
		try {
			// 运行Job
			JobExecution result = launcher.run(job, new JobParameters());
			// 处理结束， 控制台打印处理结果
			System.out.println(result.toString());
			
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
