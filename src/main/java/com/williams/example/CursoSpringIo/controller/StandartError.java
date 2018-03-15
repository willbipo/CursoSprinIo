package com.williams.example.CursoSpringIo.controller;

import java.io.Serializable;

public class StandartError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String mensaje;
	private Long timeStamp;
	
	public StandartError(Integer status, String mensaje, Long timeStamp) {
		super();
		this.status = status;
		this.mensaje = mensaje;
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	
	
	
	

	
	
	

}
