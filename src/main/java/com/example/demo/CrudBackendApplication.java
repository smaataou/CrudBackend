package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Article;
import com.example.demo.repository.ArticleRepository;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner{
	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Article a1 = articleRepository.save(new Article("ljùh", "description1"));
		Article a2 = articleRepository.save(new Article("ljùhjgff", "description2"));

		
	}
}
