package ninomal.comp.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ninomal.comp.corse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
