package com.example.api.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cajero")
	private Cajero cajero;
	@ManyToOne
	@JoinColumn(name="maquina")
	private Maquina maquina;
	@ManyToOne
	@JoinColumn(name="producto")
	private Producto producto;
	/**
	 * 
	 */
	public Venta() {
	}
	/**
	 * @param id
	 * @param cajero
	 * @param maquina
	 * @param producto
	 */
	public Venta(Long id, Cajero cajero, Maquina maquina, Producto producto) {
		this.id = id;
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}
	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}
	/**
	 * @return the maquina
	 */
	public Maquina getMaquina() {
		return maquina;
	}
	/**
	 * @param maquina the maquina to set
	 */
	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", maquina=" + maquina + ", producto=" + producto + "]";
	}
	
	
}
