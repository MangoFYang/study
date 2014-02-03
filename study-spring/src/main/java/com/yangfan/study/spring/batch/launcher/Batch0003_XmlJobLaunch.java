package com.yangfan.study.spring.batch.launcher;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Batch0003_XmlJobLaunch {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/yangfan/study/spring/batch/applicationContext.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("simpleJobLauncher");

		/*
		3.xml文件操作
		 */
		Job job = (Job) context.getBean("xmlJob");

		try {
			// 运行Job
			JobExecution result = launcher.run(job, new JobParametersBuilder()
				.addString("inputFilePath", "classpath:com/yangfan/study/spring/batch/data/xml/input.xml")
				.addString("outputFilePath", "file:src/main/resources/com/yangfan/study/spring/batch/data/xml/output.xml")
				.toJobParameters());
			// 处理结束， 控制台打印处理结果
			System.out.println(result.toString());
			
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
