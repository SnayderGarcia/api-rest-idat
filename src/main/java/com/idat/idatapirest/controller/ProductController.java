package com.idat.idatapirest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatapirest.model.Producto;
import com.idat.idatapirest.service.ProductoService;

@RestController
@RequestMapping("/product/v1")
public class ProductController {
	
	@Autowired
	private ProductoService service;
	
	@RequestMapping(method = RequestMethod.GET, path =  "/listar")
	public ResponseEntity<List<Producto>>listar(){
		
		return new ResponseEntity<List<Producto>>(service.listarProducto(), HttpStatus.OK);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Producto producto){
		service.guardarProducto(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path ="/listar/{id}")
	public @ResponseBody ResponseEntity<Producto> productById(@PathVariable Integer id){
		Producto producto = service.productoById(id);
		
		if(producto != null) {
			return new  ResponseEntity<Producto>(producto, HttpStatus.OK);
						
		}
		
		return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
	}

	
	@RequestMapping(method = RequestMethod.DELETE, path ="/Eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Producto producto = service.productoById(id);
		
		if(producto != null) {
			service.eliminarProducto(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, path = "/editar")
	public ResponseEntity<Void> editar(@RequestBody Producto producto){
		Producto product = service.productoById(producto.getIdProducto());
		
		if(producto != null) {
			service.editarProducto(product);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	
	
}
