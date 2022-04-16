package com.idat.idatapirest.dto;

public class ProductDTOResponse {

private Integer idResponse;
	
	private String nombreResponse;
	private String descripcionResponse;
	private Double precioResponse;
	private Integer stockResponse;
	public Integer getIdResponse() {
		return idResponse;
	}
	public void setIdResponse(Integer idResponse) {
		this.idResponse = idResponse;
	}
	public String getNombreResponse() {
		return nombreResponse;
	}
	public void setNombreResponse(String nombreResponse) {
		this.nombreResponse = nombreResponse;
	}
	public String getDescripcionResponse() {
		return descripcionResponse;
	}
	public void setDescripcionResponse(String descripcionResponse) {
		this.descripcionResponse = descripcionResponse;
	}
	public Double getPrecioResponse() {
		return precioResponse;
	}
	public void setPrecioResponse(Double precioResponse) {
		this.precioResponse = precioResponse;
	}
	public Integer getStockResponse() {
		return stockResponse;
	}
	public void setStockResponse(Integer stockResponse) {
		this.stockResponse = stockResponse;
	}
	
	
}
