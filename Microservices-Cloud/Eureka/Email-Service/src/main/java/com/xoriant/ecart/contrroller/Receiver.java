package com.xoriant.ecart.contrroller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class Receiver {

	@Autowired
	private JavaMailSender javaMailSender;

	@RabbitListener(queues = "Order-Details")
	public void orderIfo(Map<String, Object> orderInfo) {
		 System.out.println("===========> Email-Service:: ****====**** <===========");
			System.out.println(orderInfo);
			System.out.println("===========> Email-Service:: ****====**** <===========");
	       

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("praveen.somireddy@gmail.com", "ctsgit@gmail.com");

	        int orderId=(int)orderInfo.get("ORDER_ID");
	        LocalDateTime orderDate=(LocalDateTime)orderInfo.get("ORDER_DATE");
	        String transactionID=(String)orderInfo.get("TRANSACTION_ID");
	        double total=(double)orderInfo.get("TOTAL");
	     
	        msg.setSubject("Order Confirmation");
	        msg.setText("You Order Number "+orderId+" is placed successfully on "+orderDate +" And Total Amount paid is "+total);

	        javaMailSender.send(msg);
	}

}
