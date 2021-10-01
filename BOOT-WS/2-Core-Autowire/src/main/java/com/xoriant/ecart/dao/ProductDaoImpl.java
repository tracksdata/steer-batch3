package com.xoriant.ecart.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public void save() {
		System.out.println(">>> DAO: Saving ....");
	}

}
