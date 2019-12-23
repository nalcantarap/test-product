package cl.test.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.test.project.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
