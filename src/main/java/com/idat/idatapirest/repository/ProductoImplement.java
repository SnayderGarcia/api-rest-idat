package com.idat.idatapirest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.idatapirest.model.Producto;


@Repository
public class ProductoImplement implements ProductRepository{

	
	public List<Producto> listar = new ArrayList<Producto>();
	
	@Override
	public void guardarProducto(Producto p) {
		listar.add(p);
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		listar.remove(productoById(id));
	}

	@Override
	public void editarProducto(Producto p) {
		listar.remove(productoById(p.getIdProducto()));
		listar.add(p);
	}

	@Override
	public List<Producto> listarProducto() {
		
		return listar;
	}

	@Override
	public Producto productoById(Integer id) {
		
		return listar.stream().filter(p->p.getIdProducto()==id).findFirst().orElse(null);
	}

}
