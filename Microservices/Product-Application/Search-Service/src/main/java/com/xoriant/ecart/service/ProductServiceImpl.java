package com.xoriant.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Cart;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Order;
import com.xoriant.ecart.model.Product;
import com.xoriant.ecart.model.User;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productDao.save(product);
	}

	@Override
	public List<Category> findAllCatogories() {
		// TODO Auto-generated method stub
		return productDao.findAllCatogories();
	}

	@Override
	public Product findById(int productId) {
		// TODO Auto-generated method stub
		return productDao.findById(productId);
	}

	@Override
	public List<Brand> findAllBrands() {
		// TODO Auto-generated method stub
		return productDao.findAllBrands();
	}

	@Override
	public List<Product> filterProductsByBrandName(String brandName) {
		// TODO Auto-generated method stub
		return productDao.filterProductsByBrandName(brandName);
	}

	@Override
	public List<Product> filterProductsByMaxPriceRange(int maxPrice) {
		// TODO Auto-generated method stub
		return productDao.filterProductsByMaxPriceRange(maxPrice);
	}

	@Override
	public List<Product> filterProductsByMinAndMaxRange(int minPrice, int maxPrice) {
		// TODO Auto-generated method stub
		return productDao.filterProductsByMinAndMaxRange(minPrice, maxPrice);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public List<Product> getProductByCategory(int catagoryId) {
		// TODO Auto-generated method stub
		return productDao.getProductByCategory(catagoryId);
	}

	@Override
	public List<Product> findProductByName(String productName) {
		// TODO Auto-generated method stub
		return productDao.findProductByName(productName);
	}

}
