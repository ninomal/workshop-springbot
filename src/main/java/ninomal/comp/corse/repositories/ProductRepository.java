package ninomal.comp.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ninomal.comp.corse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
