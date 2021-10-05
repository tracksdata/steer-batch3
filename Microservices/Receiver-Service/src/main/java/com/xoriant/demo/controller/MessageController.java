package com.xoriant.demo.controller;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	 @RabbitListener(queues = "Q1")
	public void getMesaage(String msg) {
		System.out.println("--------------------------------------------------");
		System.out.println(">>>>>>>>>>>>>> Getting Mesaage <<<<<<<<<<<<<<");
		System.out.println("--------------------------------------------------");
		System.out.println("Message::: " + msg);

	}

	@RabbitListener(queues = "Q2")
	public void getMesaageV1(Map<String, Object> myData) {
		System.out.println("--------------------------------------------------");
		System.out.println("Product ID:: " + myData.get("PID"));
		System.out.println("Product Name:: " + myData.get("NAME"));
		System.out.println("Price:: " + myData.get("PRICE"));
		System.out.println("Description:: " + myData.get("DESC"));
		System.out.println("--------------------------------------------------");

	}

}
