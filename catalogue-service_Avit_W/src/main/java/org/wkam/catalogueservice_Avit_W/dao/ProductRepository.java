package org.wkam.catalogueservice_Avit_W.dao;




import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.wkam.catalogueservice_Avit_W.entities.Product;



@RepositoryRestResource
@CrossOrigin()
public interface ProductRepository extends JpaRepository<Product, Long>{


	
	  @RestResource (path = "/description")
	  public Page<Product> findByDescriptionContains( @Param("keyWord") String desc, Pageable p);
	 
}
