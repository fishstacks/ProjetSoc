package com.schoolproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.schoolproject.dao.ArticleRepository;
import com.schoolproject.entities.Article;

@SpringBootApplication
@EnableJpaRepositories
public class ServiceArticleeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceArticleeApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ArticleRepository customerRepository){
	return args ->{
	customerRepository.save(new Article(null,"PS England Shoes",300,"Faux leather rimmed soles PS English model","https://i.postimg.cc/8CmBZH5N/shoes.webp"));
	customerRepository.save(new Article(null,"PS England Jacket",100,"Trendy curduroy jacket","https://i.postimg.cc/76X9ZV8m/Screenshot_from_2022-06-03_18-45-12.png"));
	customerRepository.save(new Article(null,"PS England Shirt",80,"Linen summer jacket","https://i.postimg.cc/j2FhzSjf/bs2.png"));
	customerRepository.save(new Article(null,"PS England Blacked-out shoes ",250,"Matte black PS English model","https://i.postimg.cc/QtjSDzPF/bs3.png"));
	
	customerRepository.findAll().forEach(System.out::println);
	
	};
	}}
