package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Article;

public interface IArticleService {
	List<Article> getArticles();
	void addArticle(Article article);
	void updateArticle(Article article);
	void deleteArticle(Long id);
	Article findById(Long id);
	

}
