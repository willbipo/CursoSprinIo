package com.williams.example.CursoSpringIo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date fecha;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="pedido")
	private Pago pago;
	
	@ManyToOne
	@JoinColumn(name="direccion_id")
	private Direccion direccion;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public Pedido() {}

	public Pedido(Integer id, Date fecha, Direccion direccion, Cliente cliente, Pago pago) {
		this.id = id;
		this.fecha = fecha;
		this.direccion = direccion;
		this.cliente = cliente;
		this.pago = pago;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Pago getPago() {
		return pago;
	}


	public void setPago(Pago pago) {
		this.pago = pago;
	}

	

}
