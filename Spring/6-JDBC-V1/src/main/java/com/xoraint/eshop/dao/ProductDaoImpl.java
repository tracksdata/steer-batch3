package com.xoraint.eshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xoraint.eshop.model.Product;

@Repository
public class ProductDaoImpl {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public ProductDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// find all Products using queryForList
	public List<Map<String, Object>> findAll() {
		return jdbcTemplate.queryForList("select * from products");

	}

	/*
	 * using Domain Objects ========================== 
	 * 1. RowMapper 
	 * 	  -> T mapRow(ResultSet rs, int rowNum) 
	 * 2. RowCallbackHandler 
	 *    -> void processRow(ResultSet rs) throws SQLException; 
	 * 3. ResultSetExtractor 
	 * -> T extractData(ResultSet rs)
	 */

	// 1. RowMapper
	// ==================

	public List<Product> getAllProducts() {
		List<Product> prods = jdbcTemplate.query("select * from products", new RowMapperTest());
		return prods;
	}

	// 3. ResultSetExtractor
	// ==========================

	public List<Product> getAllProductsV1() {
		List<Product> prods = jdbcTemplate.query("select * from products", new ResultSetExtractorTest());

		return prods;
	}
	
	
	// using lamda expression
	public List<Product> findAllProductsV2(){
		return jdbcTemplate.query("select * from products", (ResultSet rs)->{
			List<Product> prods=new ArrayList<>();
			while(rs.next()) {
				Product prod = new Product();
				prod.setProductId(rs.getInt("product_id"));
				prod.setProductName(rs.getString("product_title"));
				prod.setDescription(rs.getString("product_desc"));
				prod.setImagePath(rs.getString("product_image"));
				prod.setKeywords(rs.getString("product_keywords"));
				prod.setPrice(rs.getDouble("product_price"));
				prod.setQuantity(rs.getInt("product_qty"));
				prods.add(prod);
			}
			return prods;
		});
	}
}

class ResultSetExtractorTest implements ResultSetExtractor<List<Product>> {

	List<Product> prods = new ArrayList<Product>();

	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

		while (rs.next()) {
			Product prod = new Product();
			prod.setProductId(rs.getInt("product_id"));
			prod.setProductName(rs.getString("product_title"));
			prod.setDescription(rs.getString("product_desc"));
			prod.setImagePath(rs.getString("product_image"));
			prod.setKeywords(rs.getString("product_keywords"));
			prod.setPrice(rs.getDouble("product_price"));
			prod.setQuantity(rs.getInt("product_qty"));
			prods.add(prod);
		}

		return prods;
	}
}

class RowMapperTest implements RowMapper<Product> {
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product prod = null;
		prod = new Product();
		prod.setProductId(rs.getInt("product_id"));
		prod.setProductName(rs.getString("product_title"));
		prod.setDescription(rs.getString("product_desc"));
		prod.setImagePath(rs.getString("product_image"));
		prod.setKeywords(rs.getString("product_keywords"));
		prod.setPrice(rs.getDouble("product_price"));
		prod.setQuantity(rs.getInt("product_qty"));

		return prod;
	}
}
