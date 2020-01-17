package org.wkam.catalogueservice_Avit_W.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection (name =" premiereP", types= Product.class)
public interface ProductProjection {
	
 public  double getPricce();
public  String getDescription();	
	
	
	

}
