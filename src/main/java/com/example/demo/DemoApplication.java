package com.example.demo;

import com.example.demo.repository.CatalogRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		CatalogRepository repository = context.getBean(CatalogRepository.class);
//		repository.save(new Catalog("сарафан",42,90,"black","koko",12536));

	}

}
