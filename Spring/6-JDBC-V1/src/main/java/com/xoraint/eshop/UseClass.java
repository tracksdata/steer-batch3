package com.xoraint.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoraint.eshop.config.AppConfig;
import com.xoraint.eshop.dao.ProductDaoImpl;
import com.xoraint.eshop.model.Product;

public class UseClass {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
		
//		prodDao.findAll().forEach(prod->{
//			System.out.println(prod);
//		});
		
		// using rowMapper interface
		//prodDao.getAllProducts().forEach(product->{
		//	System.out.println(product);
		//});
		
		// using resultsetextractor
		
		//prodDao.getAllProductsV1().forEach(System.out::println);
		//prodDao.findAllProductsV2().forEach(System.out::println);
		Product prod = prodDao.findProductById(28);
		if(prod!=null) {
			System.out.println(prod);
		}else {
			System.out.println("Id not foound");
		}
		

	}

}
