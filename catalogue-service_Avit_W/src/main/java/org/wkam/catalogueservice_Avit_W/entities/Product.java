package org.wkam.catalogueservice_Avit_W.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.implementation.bind.annotation.AllArguments;



/* variable should be in english*/

//@CrossOrigin(origins = "http://localhost:4200")

@Entity
@Data 
@NoArgsConstructor @AllArgsConstructor @ToString 


public class Product implements Serializable{
   
	@Id  @GeneratedValue(strategy =GenerationType.IDENTITY)
   	private Long id; 
	
	private String description; 
	private double price;  
	private  int quantity;  
	
	
	/*
	 * public Product( Long id, String description, double price, int quantity){ //
	 * super(); this.id =id; this.description = description; this.price = price;
	 * this.quantity = quantity;
	 * 
	 * }
	 */
	 
	 
	 
	
}

    
