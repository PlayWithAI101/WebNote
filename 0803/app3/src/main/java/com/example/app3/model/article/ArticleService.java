package com.example.app3.model.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository repos;
	
	public void addArticle(Article a){
		repos.save(a);
	}
	
	public Article getByNum(Integer num){
		return repos.getOne(num);
	}
	
	public List<Article> getAll(){
		return repos.findAll();
	}
	
//	public List<Article> getByWriter(String writer){
//		return repos.
//	}
	
	public void editArticle(Article a){
		repos.save(a);
	}
	
	public void delArticle(Integer num){
		repos.deleteById(num);
	}
	
	
}
