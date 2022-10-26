package ec.marinVictor.Marin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.marinVictor.Marin.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
  
}
