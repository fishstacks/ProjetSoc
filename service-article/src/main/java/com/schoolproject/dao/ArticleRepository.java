package com.schoolproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.schoolproject.entities.Article;



public interface ArticleRepository extends JpaRepository<Article,Long>{

}