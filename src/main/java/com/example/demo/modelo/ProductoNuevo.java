package com.example.demo.modelo;

public class ProductoNuevo {
	//Producto nuevo codigo barras y cantidad
	private String codigoBarra;
	private Integer cantidad;
	//GET Y SET
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "ProductoNuevo [codigoBarra=" + codigoBarra + ", cantidad=" + cantidad + "]";
	}
}
