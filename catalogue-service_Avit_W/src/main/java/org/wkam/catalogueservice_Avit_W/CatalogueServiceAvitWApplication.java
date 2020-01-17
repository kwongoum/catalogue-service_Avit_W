package org.wkam.catalogueservice_Avit_W;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.wkam.catalogueservice_Avit_W.dao.ProductRepository;
import org.wkam.catalogueservice_Avit_W.entities.Product;


//@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
public class CatalogueServiceAvitWApplication implements CommandLineRunner {
	
	@Autowired // pour injection des dépendances.
	private  ProductRepository productRepository;
	@Autowired
	private RepositoryRestConfiguration   restConfiguration;  
	
	public static void main(String[] args) {
		SpringApplication.run(CatalogueServiceAvitWApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		 restConfiguration.exposeIdsFor(Product.class);
		 productRepository.save(new Product(null, " livre- histoire Cameroun by Avit W.", 1000, 11));
		 productRepository.save(new Product(null, "livre- histoire Afrique by Avit W. ", 2000, 21));
		 productRepository.save(new Product(null, "livre- histoire Bamileke by Avit W.", 3000, 31));
		 productRepository.save(new Product(null, "livre-  entrepreunariat Cameroun by Avit W.", 4000, 41));
		 productRepository.save(new Product(null, "eeeeeeeeeeee", 5000, 51));
		 productRepository.save(new Product(null, "livre- Cameroun horizon 2025", 6000, 61));
		 productRepository.save(new Product(null, "livre- visite Ccameroun  tome3", 7000, 71));
		 productRepository.save(new Product(null, " livre- Cameroun tome2", 80, 7));
		
		 productRepository.findAll().forEach(prdct-> {
			 System.out.println(prdct.toString());
		 });
		
	
	}

}
