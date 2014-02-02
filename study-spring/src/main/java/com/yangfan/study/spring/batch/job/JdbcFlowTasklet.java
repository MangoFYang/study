package com.yangfan.study.spring.batch.job;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class JdbcFlowTasklet implements Tasklet {
	
	private int count = 0;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("---JdbcFlowTasklet---" + chunkContext.getStepContext().getStepName());
		count ++;
		if(count >= 1 && count <= 10) {
			return RepeatStatus.CONTINUABLE;
		}
		return RepeatStatus.FINISHED;
	}

}
