package com.idat.idatapirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;
import com.idat.idatapirest.model.Producto;
import com.idat.idatapirest.repository.ProductRepository;

@Service
public class ProductoService implements ProductoServiceImplement{
	
	
	@Autowired
	private ProductRepository repository;
	

	@Override
	public void guardarProducto(Producto p) {
		repository.guardarProducto(p);
		
	}

	@Override
	public void eliminarProducto(Integer id) {

		repository.eliminarProducto(id);
		
	}

	@Override
	public void editarProducto(Producto p) {
		repository.editarProducto(p);
		
	}

	@Override
	public List<Producto> listarProducto() {
		return repository.listarProducto();
	}

	@Override
	public Producto productoById(Integer id) {
		return repository.productoById(id);
	}
	
	
}
