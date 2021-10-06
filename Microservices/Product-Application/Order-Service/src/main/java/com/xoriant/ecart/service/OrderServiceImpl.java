package com.xoriant.ecart.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.xoriant.ecart.controller.Sender;
import com.xoriant.ecart.model.ItemLine;
import com.xoriant.ecart.model.Order;

@Service
public class OrderServiceImpl {

	private RestTemplate rt = new RestTemplate();

	@Autowired
	private Sender sender;

	public Order placeOrder(String user) {

		String url = "http://localhost:8084/api/cart/" + user;

		ItemLine[] itemLine = rt.getForObject(url, ItemLine[].class);

		double totalAmount = Arrays.stream(itemLine).mapToDouble(line -> (line.getItem().getPrice() * line.getQty()))
				.sum();

		Order order = new Order(5, 1, 1, totalAmount, "8AT7125245323433NN", "Success");

		System.out.println(">>>> TOTAL AMOUNT:: " + totalAmount);
		
		// Send Order Information to the Rabbit MQ
		Map<String, Object> oderInfo=new HashMap<String, Object>();
		
		oderInfo.put("ORDER_ID", order.getOrderId());
		oderInfo.put("ORDER_DATE", LocalDateTime.now());
		oderInfo.put("TRANSACTION_ID", order.getTransactionId());
		oderInfo.put("TOTAL", order.getTotal());
		
		//-------------------------------------
		sender.sendOrderDetails(oderInfo);
		//-------------------------------------
		

		return order;
		
		

	}

}
