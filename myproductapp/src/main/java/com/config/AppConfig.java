package com.config;

import org.springframework.context.annotation.Configuration;

import SampleSpringApp.productsapp.Bean;
import SampleSpringApp.productsapp.Product;

@Configuration
public class AppConfig {
	@org.springframework.context.annotation.Bean(name="coffee")
	public Product getProduct()
	{
		Product product new Product("Coffe",23,100);
		return product;
	}

}
