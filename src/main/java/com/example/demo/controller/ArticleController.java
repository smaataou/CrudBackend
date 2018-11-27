package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Article;
import com.example.demo.service.IArticleService;

@RestController
@RequestMapping("/api/articles")
@CrossOrigin
public class ArticleController {
/*	  public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
*/
	@Autowired
	private IArticleService articleService;
	
	@GetMapping
	public List<Article> getArticles(){
		return articleService.getArticles();
	}
	@PostMapping
	public  void addArticle(@RequestBody Article article){
		 articleService.addArticle(article);
	}
	@PutMapping
	public  void updateArticle(@RequestBody Article article){
		 articleService.updateArticle(article);
	}
	@DeleteMapping("/{id}")
	public  void deleteArticle(@PathVariable Long id){
		 articleService.deleteArticle(id);
	}
	/*@RequestMapping("/upload")
	  public String upload(Model model,@RequestParam("files") MultipartFile[] files) {
		  StringBuilder fileNames = new StringBuilder();
		  for (MultipartFile file : files) {
			  Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			  fileNames.append(file.getOriginalFilename()+" ");
			  try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
		  model.addAttribute("msg", "Successfully uploaded files "+fileNames.toString());
		  return "uploadstatusview";
	  }
*/
	

}
