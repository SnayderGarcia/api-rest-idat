package com.idat.idatapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Integer>{


}
