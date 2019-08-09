package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.clients.ProductClient;
import com.example.demo.model.Product;

@SpringBootApplication
public class ProductManagementClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ProductManagementClientApplication.class, args);
		Product product= ctx.getBean(Product.class);
		ProductClient client = ctx.getBean(ProductClient.class);
		client.getAll();
		client.addProduct(product);
		ctx.close();
	}

}
