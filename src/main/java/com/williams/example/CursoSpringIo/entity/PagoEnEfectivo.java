package com.williams.example.CursoSpringIo.entity;

import java.util.Date;

import javax.persistence.Entity;

import com.williams.example.CursoSpringIo.enums.EstadoPago;

@Entity
public class PagoEnEfectivo extends Pago{
	
	private static final long serialVersionUID = 1L;

	private Date fechaVencimiento;
	private Date fechaPago;
	
	public PagoEnEfectivo() {}
	
	public PagoEnEfectivo(Integer id, EstadoPago estado, Pedido pedido,Date fechaVencimiento,Date fechaPago) {
		super(id, estado, pedido);
		this.fechaVencimiento = fechaVencimiento;
		this.fechaPago = fechaPago;
	}
	
	
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	
	

}
