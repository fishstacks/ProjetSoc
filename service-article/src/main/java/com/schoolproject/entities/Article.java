package com.schoolproject.entities;

import java.util.Date;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor 

@ToString
@Entity

public class Article {
	

		 @Id
		    @GeneratedValue(strategy = GenerationType.TABLE)
		    
		    private  Long id;
		    private String nom;
		    private int prix;
            private String desc;
            private  String img;
	         
	       
		
	}