package com.xoriant.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MesaageServiceImpl {

	@Autowired
	private RabbitTemplate rt;

	// create a queue
	@Bean
	public Queue f1() {
		return new Queue("Q1", false);
	}

	// create a queue
	@Bean
	public Queue f2() {
		return new Queue("Q2", false);
	}

	// send a message to the Q1 queue name

	public void sendMessage() {
		rt.convertAndSend("Q1", "Test Mesaage from MesaageServiceImpl - V2 :: service 1");
	}

	public void sendMessageV1() {

		Map<String, Object> data = new HashMap<String, Object>();
		
		data.put("PID", "P001");
		data.put("NAME", "Pen");
		data.put("PRICE", 1500);
		data.put("DESC", "Red Ink");

		rt.convertAndSend("Q2", data);
	}

}
