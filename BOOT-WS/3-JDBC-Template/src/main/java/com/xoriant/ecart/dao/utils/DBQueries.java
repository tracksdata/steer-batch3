package com.xoriant.ecart.dao.utils;

public class DBQueries {
	
	public final static String FIND_PRODUCT_BY_PRODUCTID="select * from products p inner join brands b on p.product_brand=b.brand_id inner join categories c on p.product_cat = c.cat_id where p.product_id=?";
	public final static String FIND_PRODUCT_BY_PRODUCTNAME="select * from products p inner join brands b on p.product_brand=b.brand_id inner join categories c on p.product_cat = c.cat_id where p.product_title like ?";
	public final static String FIND_PROODUCTS_BY_CATEGORY = "select * from products p inner join brands b on p.product_brand=b.brand_id inner join categories c on p.product_cat = c.cat_id where p.product_cat=?";
	public static final String FIND_ALL_PRODUCTS="select * from products p inner join brands b on p.product_brand=b.brand_id inner join categories c on p.product_cat = c.cat_id";
	public static final String FILTER_PRODUCTS_BY_PRICE="select * from products where product_price between ? and ?";
	public static final String FILTER_PRICE_MAX_RANGE="select * from products where product_price>=?";
	public static final String FILTER_PRODUCTS_BY_BRAND="select * from products p inner join  brands b ON p.product_brand=b.brand_id where b.brand_title like ?";
	public static final String FIND_BRAND_NAMES="select * from brands";
	public static final String FIND_ALL_CATEGORIES="select * from categories";
	public static final String SAVE_NEW_PRODUCT="insert into products values(?,?,?,?,?,?,?,?,?)";
	

	/*
	 * 
	 *   
	 *    
	 *    	Sub images can be saved as String array in the same table.
	 *    	Product ID itself act like image path
	 *      100011IMG1.JPG,100011IMG2.JPG,100011IMG3.JPG
	 *      
	 *      
	 *      
	 *      --> BeanPropertyRowMapper
	 *      --> SetDatatype
	 *      
	 *      
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
}
