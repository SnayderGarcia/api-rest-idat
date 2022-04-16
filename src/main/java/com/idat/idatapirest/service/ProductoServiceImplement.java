package com.idat.idatapirest.service;

import java.util.List;

import com.idat.idatapirest.dto.ProductDTOResponse;
import com.idat.idatapirest.dto.ProductRequestDTO;

public interface ProductoServiceImplement {
	
	public void guardarProducto(ProductRequestDTO p);
	public void eliminarProducto(Integer id);
	public void editarProducto(ProductRequestDTO p);
	public List<ProductDTOResponse> listarProducto();
	public ProductDTOResponse productoById(Integer id);
	

}
