package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle")
public class Detalle {
	@Id
	@Column(name="deta_id")
	private Integer id;
	@Column(name="deta_cantidad")
	private Integer Cantidad;
	@Column(name="deta_precio_nitario")
	private BigDecimal precioUnitario;
	@Column(name="deta_subtotal")
	private BigDecimal subtotal;
	@ManyToOne
	@JoinColumn(name="deta_id_factura")
	private Factura factura;
	@ManyToOne
	@JoinColumn(name="deta_id_item")
	private Item item;
	//GET Y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return Cantidad;
	}
	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Detalle [id=" + id + ", Cantidad=" + Cantidad + ", precioUnitario=" + precioUnitario + ", subtotal="
				+ subtotal + "]";
	}
	
}
