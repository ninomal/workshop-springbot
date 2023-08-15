package ninomal.comp.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ninomal.comp.corse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
