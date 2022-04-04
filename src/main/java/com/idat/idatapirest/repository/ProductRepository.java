package com.idat.idatapirest.repository;

import java.util.List;

import com.idat.idatapirest.model.Producto;

public interface ProductRepository {
	
	public void guardarProducto(Producto p);
	public void eliminarProducto(Integer id);
	public void editarProducto(Producto p);
	public List<Producto> listarProducto();
	public Producto productoById(Integer id);
	

}
