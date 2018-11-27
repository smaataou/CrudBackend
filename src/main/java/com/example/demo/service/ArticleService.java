package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Article;
import com.example.demo.repository.ArticleRepository;

@Service
public class ArticleService implements IArticleService{
	
	@Autowired
	private ArticleRepository articleRepository;
	
	

	@Override
	public List<Article> getArticles() {
		return articleRepository.findAll();
	}

	@Override
	public void addArticle(Article article) {
		articleRepository.save(article);
		
	}

	@Override
	public void updateArticle(Article article) {
		articleRepository.save(article);
		
	}

	@Override
	public void deleteArticle(Long id) {
		Article article = new Article();
		article.setId(id);
		articleRepository.delete(article);
		
	}
	
	@Override
	public Article findById(Long id) {
		Optional<Article> article = articleRepository.findById(id);
		if(!article.isPresent()){
			throw new RuntimeException("Motorcycle not found");
		}
		return article.get();
	}

	

}
