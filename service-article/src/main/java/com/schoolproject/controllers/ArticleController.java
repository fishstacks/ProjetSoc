package com.schoolproject.controllers;
	
	



import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.schoolproject.dao.ArticleRepository;



	@Controller
		public class ArticleController{
		  
			

			
		    @GetMapping("/")
		    public String index(Model model ){
		    	
		        return "index";
		    }
		 
		    
		    @Autowired
			ArticleRepository articleRepo;
			
			@GetMapping("/articles")
			public String articles(Model model ){
				model.addAttribute("articles", articleRepo.findAll());
				return "articles";
			}
		  
		    @GetMapping("/login")
		    public String Login(Model model ){
		        return "login";
		    }
		    
		    
		    
		  
		}