package com.idat.idatapirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.dto.ProductDTOResponse;
import com.idat.idatapirest.dto.ProductRequestDTO;
import com.idat.idatapirest.model.Producto;
import com.idat.idatapirest.repository.ProductRepository;

@Service
public class ProductoService implements ProductoServiceImplement {

	@Autowired
	private ProductRepository repository;

	@Override
	public void guardarProducto(ProductRequestDTO p) {
		Producto producto = new Producto();
		producto.setIdProducto(p.getIdResquest());
		producto.setNombreProducto(p.getNombreProducto());
		producto.setDescripcion(p.getDescripcionProducto());
		producto.setPrecio(p.getPrecioProducto());
		producto.setStock(p.getStockProducto());

		repository.save(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {

		repository.deleteById(id);

	}

	@Override
	public void editarProducto(ProductRequestDTO p) {
		
		Producto producto = new Producto();
		producto.setIdProducto(p.getIdResquest());
		producto.setNombreProducto(p.getNombreProducto());
		producto.setDescripcion(p.getDescripcionProducto());
		producto.setPrecio(p.getPrecioProducto());
		producto.setStock(p.getStockProducto());
		
		repository.saveAndFlush(producto);

	}

	
	@Override
	public List<ProductDTOResponse> listarProducto() {

		List<ProductDTOResponse> dto = new ArrayList<ProductDTOResponse>();
		ProductDTOResponse productDTO = null;
		
		List<Producto> producto = repository.findAll();
		
		for (Producto products: producto) {
			
			productDTO = new ProductDTOResponse();
			productDTO.setIdResponse(products.getIdProducto());
			productDTO.setNombreResponse(products.getNombreProducto());
			productDTO.setDescripcionResponse(products.getDescripcion());
			productDTO.setPrecioResponse(products.getPrecio());
			productDTO.setStockResponse(products.getStock());
			
			
			dto.add(productDTO);
			
		}
		
		return dto;
	}

	@Override
	public ProductDTOResponse productoById(Integer id) {
		
		Producto products = repository.findById(id).orElse(null);
		ProductDTOResponse productDTO = new ProductDTOResponse();
		
		productDTO = new ProductDTOResponse();
		productDTO.setIdResponse(products.getIdProducto());
		productDTO.setNombreResponse(products.getNombreProducto());
		productDTO.setDescripcionResponse(products.getDescripcion());
		productDTO.setPrecioResponse(products.getPrecio());
		productDTO.setStockResponse(products.getStock());
		
		
		return productDTO;
	}

}
