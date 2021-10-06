package com.xoriant.ecart.controller;

import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class Sender {
	@Autowired
	private RabbitTemplate rt;
	
	@Bean
	public Queue q1() {
		return new Queue("Order-Details",false);
	}
	
	public void sendOrderDetails(Map<String, Object> orderInfo) {
		System.out.println(">>> Writing Order Information to the Queue <<<<");
		rt.convertAndSend("Order-Details",orderInfo);
		System.out.println(">>> Order Information Writtren to the Queue <<<<");
	}
	
	

}
