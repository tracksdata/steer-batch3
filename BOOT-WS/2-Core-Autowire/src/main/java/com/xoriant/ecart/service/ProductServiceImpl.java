package com.xoriant.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.xoriant.ecart.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;
	
	@Value("${name}")
	private String pname;

	@Override
	public void saveProduct() {
		System.out.println(">>> Service: saving ...");
		System.out.println(">>> name is "+pname);
		prodDao.save();

	}

}
