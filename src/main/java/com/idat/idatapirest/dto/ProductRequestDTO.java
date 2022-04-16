package com.idat.idatapirest.dto;

public class ProductRequestDTO {

	private Integer idResquest;
	
	private String nombreProducto;
	private String descripcionProducto;
	private Double precioProducto;
	private Integer stockProducto;
	public Integer getIdResquest() {
		return idResquest;
	}
	public void setIdResquest(Integer idResquest) {
		this.idResquest = idResquest;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Integer getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(Integer stockProducto) {
		this.stockProducto = stockProducto;
	}
	
	
	
	
}
