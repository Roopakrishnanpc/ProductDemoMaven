package com.ProductManagement.ProductDemoMaven;

import java.util.List;

import com.ProductManagement.ProductDemoMaven.Entity.Product;
import com.ProductManagement.ProductDemoMaven.Service.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ProductService productService=new ProductService();
		System.out.println(productService);
	//	Product product=new Product("Dell","Laptop","Ooty",2023);
		//productService.addProduct(product);
		//All these are anonyms objects
//		productService.addProduct(new Product("Dell", "Laptop", "Tuty", 2024));
//	    productService.addProduct(new Product("HP", "Desktop", "Mumbai", 2022));
//	    productService.addProduct(new Product("Apple", "Tablet", "Delhi", 2021));
//	    productService.addProduct(new Product("Lenovo", "Laptop", "Bangalore", 2020));
//	    productService.addProduct(new Product("Asus", "Monitor", "Chennai", 2019));
//        productService.addProduct(new Product("Acer", "Laptop", "Hyderabad", 2018));
//        productService.addProduct(new Product("Samsung", "Printer", "Pune", 2017));
//	    productService.addProduct(new Product("Microsoft", "Desktop", "Kolkata", 2016));
//	    productService.addProduct(new Product("Sony", "Tablet", "Jaipur", 2015));
//	    productService.addProduct(new Product("Toshiba", "Monitor", "Ahmedabad", 2014));
//	    productService.addProduct(new Product("Toshibanew", "Laptop", "Bangalore", 2024));
		System.out.println("Get all products");
	    List<Product> productList=productService.getAllProducts();
	    
	    for(Product p:productList)
	    {
	    	System.out.println(p);
	    }
	    System.out.println("Get particular product");
	    List<Product> productByName=productService.getProductByName("Dell");
	    for(Product p:productByName)
	    {
	    	System.out.println(p);
	    }
//	    System.out.println(productByName);
//	    System.out.println("Warranty completed");
//	    System.out.println(productService.outOfWarranty());
//	    System.out.println(productService.particularPlace("Chennai"));
//	    
//	    System.out.println(productService.getProductByWord("Toshiba"));
//	    
//	    productService.removeProductForEach("Toshiba");
//	    productService.removeProduct("Dell");
    }
}
