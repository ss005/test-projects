package com.test.springbatch.batch;

import org.springframework.batch.item.ItemProcessor;  

public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {

	@Override
	public Tutorial process(Tutorial item) {
		System.out.println("CustomProcessor :: process" + item );
		return item ;
	}


}