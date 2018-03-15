package com.williams.example.CursoSpringIo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.williams.example.CursoSpringIo.enums.EstadoPago;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Pago implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer estado;
	
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId
	private Pedido pedido;
	
	public Pago(){}
	
	public Pago(Integer id, EstadoPago estado, Pedido pedido) {
		super();
		this.id = id;
		this.estado = estado.getCodigo();
		this.pedido = pedido;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPago getEstado() {
		return EstadoPago.toEnum(estado);
	}

	public void setEstado(EstadoPago estado) {
		this.estado = estado.getCodigo();
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	

}
