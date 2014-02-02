package com.yangfan.study.spring.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class LogJobListener implements JobExecutionListener {
	
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("批处理Job监听器LogJobListener.beforeJob被调用，参数为：jobExecution[ " + jobExecution + " ]");
	}

	public void afterJob(JobExecution jobExecution) {
		System.out.println("批处理Job监听器LogJobListener.afterJob被调用，参数为：jobExecution[ " + jobExecution + " ]");
	}

}
