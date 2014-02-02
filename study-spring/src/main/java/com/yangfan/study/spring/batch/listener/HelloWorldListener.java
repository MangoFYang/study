package com.yangfan.study.spring.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class HelloWorldListener implements JobExecutionListener {
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("HelloWorldListener.beforeJob : " + jobExecution);
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("HelloWorldListener.afterJob : " + jobExecution);
	}

}
