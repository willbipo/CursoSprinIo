package com.williams.example.CursoSpringIo.entity;

import javax.persistence.Entity;

import com.williams.example.CursoSpringIo.enums.EstadoPago;

@Entity
public class PagoConTarjeta extends Pago{
	
	private static final long serialVersionUID = 1L;

	private Integer numero;
	
	public PagoConTarjeta() {}

	public PagoConTarjeta(Integer id, EstadoPago estado, Pedido pedido,Integer numero) {
		super(id, estado, pedido);
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	

}
