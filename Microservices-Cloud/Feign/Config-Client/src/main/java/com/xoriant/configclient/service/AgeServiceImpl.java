package com.xoriant.configclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgeServiceImpl {
	
	
	@Autowired
	private TestFeignService tf;
	
	public String getAge(int age) {
		return tf.f1(age); // 7072's data
	}

}
