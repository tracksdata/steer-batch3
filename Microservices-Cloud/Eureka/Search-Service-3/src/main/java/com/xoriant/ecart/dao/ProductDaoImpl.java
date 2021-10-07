package com.xoriant.ecart.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.ecart.dao.utils.DBQueries;
import com.xoriant.ecart.model.Brand;
import com.xoriant.ecart.model.Category;
import com.xoriant.ecart.model.Product;



@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Product save(Product product) {
		jdbcTemplate.update(DBQueries.SAVE_NEW_PRODUCT, product.getProductId(), product.getCategory().getCategoryId(),
				product.getBrand().getBrandId(), product.getProductName(), product.getPrice(), product.getQuantity(),
				product.getDescription(), product.getImagePath(), product.getKeywords());
		return product;
	}

	// find all categories
	@Override
	public List<Category> findAllCatogories() {
		return jdbcTemplate.query(DBQueries.FIND_ALL_CATEGORIES, (ResultSet rs) -> {
			List<Category> catogories = new ArrayList<Category>();
			System.out.println(">>>>>>>>>>> LISTING ALL CATEGORIES - METHOD <<<<<<<<<<<");

			while (rs.next()) {

				Category category=new Category();
				category.setCategoryId(rs.getInt("cat_id"));
				category.setCategoryTitle(rs.getString("cat_title"));

				catogories.add(category);
			}
			return catogories;
		});	}

	// find Product by product ID
	@Override
	public Product findById(int productId) {
		return jdbcTemplate.query(DBQueries.FIND_PRODUCT_BY_PRODUCTID, (ResultSet rs) -> {

			Product product = new Product();

			if (rs.next()) {

				Category category = new Category();
				Brand brand = new Brand();

				category.setCategoryId(rs.getInt("cat_id"));
				category.setCategoryTitle(rs.getString("cat_title"));
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setBrandTitle(rs.getString("brand_title"));

				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setProductName(rs.getString("product_title"));

				product.setCategory(category);
				product.setBrand(brand);

			} else {
				return null;
			}
			return product;
		}, productId);
	}

	// find all brand names
	@Override
	public List<Brand> findAllBrands() {

		return jdbcTemplate.query(DBQueries.FIND_BRAND_NAMES, (ResultSet rs) -> {
			List<Brand> brandList = new ArrayList<Brand>();
			System.out.println(">>>>>>>>>>> LISTING ALL BRANDS - METHOD <<<<<<<<<<<");

			while (rs.next()) {

				Brand brand = new Brand();
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setBrandTitle(rs.getString("brand_title"));

				brandList.add(brand);
			}
			return brandList;
		});
	}

	// filter products by brand
	@Override
	public List<Product> filterProductsByBrandName(String brandName) {
		return jdbcTemplate.query(DBQueries.FILTER_PRODUCTS_BY_BRAND, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setProductName(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, brandName);
	}

	// filter products by Price max and min range
	@Override
	public List<Product> filterProductsByMaxPriceRange(int maxPrice) {
		return jdbcTemplate.query(DBQueries.FILTER_PRICE_MAX_RANGE, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setProductName(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, maxPrice);
	}

// filter products by Price max and min range
	@Override
	public List<Product> filterProductsByMinAndMaxRange(int minPrice, int maxPrice) {
		return jdbcTemplate.query(DBQueries.FILTER_PRODUCTS_BY_PRICE, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setProductName(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, minPrice, maxPrice);
	}

	// Find all products
	@Override
	public List<Product> findAll() {
		return jdbcTemplate.query(DBQueries.FIND_ALL_PRODUCTS, (ResultSet rs) -> {

			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {

				Product product = new Product();
				Category category = new Category();
				Brand brand = new Brand();

				category.setCategoryId(rs.getInt("cat_id"));
				category.setCategoryTitle(rs.getString("cat_title"));
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setBrandTitle(rs.getString("brand_title"));

				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setProductName(rs.getString("product_title"));
				product.setCategory(category);
				product.setBrand(brand);

				productList.add(product);
			}
			return productList;
		});
	}

	// fetch products by catagoryId
	@Override
	public List<Product> getProductByCategory(int catagoryId) {
		return jdbcTemplate.query(DBQueries.FIND_PROODUCTS_BY_CATEGORY, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				Category category = new Category();
				Brand brand = new Brand();

				category.setCategoryId(rs.getInt("cat_id"));
				category.setCategoryTitle(rs.getString("cat_title"));
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setBrandTitle(rs.getString("brand_title"));

				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setProductName(rs.getString("product_title"));
				product.setCategory(category);
				product.setBrand(brand);

				productList.add(product);
			}
			return productList;
		}, catagoryId);
	}

	@Override
	public List<Product> findProductByName(String productName) {
		return jdbcTemplate.query(DBQueries.FIND_PRODUCT_BY_PRODUCTNAME, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				Category category = new Category();
				Brand brand = new Brand();

				category.setCategoryId(rs.getInt("cat_id"));
				category.setCategoryTitle(rs.getString("cat_title"));
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setBrandTitle(rs.getString("brand_title"));

				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setProductName(rs.getString("product_title"));
				product.setCategory(category);
				product.setBrand(brand);

				productList.add(product);
			}
			return productList;
		}, productName);
		
	}

} // END OF ProductDaoImpl CLASS
