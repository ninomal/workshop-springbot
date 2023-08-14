package ninomal.comp.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ninomal.comp.corse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
