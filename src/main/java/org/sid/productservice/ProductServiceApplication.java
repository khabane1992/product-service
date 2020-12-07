package org.sid.productservice;

import org.sid.productservice.domain.Product;
import org.sid.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

	private final ProductRepository productRepository;

	public ProductServiceApplication(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null,"ordinateur bureau",80000));
		productRepository.save(new Product(null,"imprimante",30000));
		productRepository.save(new Product(null,"iphone 12",100000));
		productRepository.save(new Product(null,"ordinateur portable",90000));

		productRepository.findAll().forEach(product -> {
			System.out.println(product.toString());
		});
	}
}
