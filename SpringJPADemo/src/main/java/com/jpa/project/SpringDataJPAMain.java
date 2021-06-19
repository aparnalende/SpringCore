package com.jpa.project;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.jpa.project.SpringJPADemo.configuration.AppConfig;
import com.jpa.project.SpringJPADemo.model.Product;
import com.jpa.project.SpringJPADemo.service.ProductService;

public class SpringDataJPAMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//Get service from context.
		ProductService productService = (ProductService) context.getBean("productService");

		//Add some items
		productService.add(new Product(1, "Television"));
		productService.add(new Product(2, "Phone"));
		productService.addAll(Arrays.asList(
				new Product(3, "Peach"),
				new Product(4, "Strawberry"),
				new Product(5, "Melone"),
				new Product(6, "Onion")
				));

		//Test entity listing
		System.out.println("findAll=" + productService.findAll());

		//Test specified find methods
		System.out.println("findByName is 'Peach': " + productService.findByNameIs("Peach"));
		System.out.println("findByNameContainingIgnoreCase 'on': " + productService.findByNameContainingIgnoreCase("on"));

		context.close();

	}

}
