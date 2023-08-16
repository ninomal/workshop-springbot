package ninomal.comp.corse.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ninomal.comp.corse.entities.Product;
import ninomal.comp.corse.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductService category;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = category.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> finById(@PathVariable Long id){
		Product obj = category.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
