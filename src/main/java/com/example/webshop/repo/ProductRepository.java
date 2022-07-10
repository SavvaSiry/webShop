package com.example.webshop.repo;

import com.example.webshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

//    @Query(value = "select name, brand,    from products inner join ", nativeQuery = true)
//    List<ProxyGroup> findAll(@Param("token") String token);

}
