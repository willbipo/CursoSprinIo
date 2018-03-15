package com.williams.example.CursoSpringIo.enums;

public enum EstadoPago {
	
	PENDINTE(1,"Pendiente"),
	ELIMINADO(2,"Eliminado"),
	CANCELADO(3,"Cancelado");
	
	private int codigo;
	private String descripcion;
	
	private EstadoPago(int codigo, String descripcion){
		this.codigo=codigo;
		this.descripcion=descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public static EstadoPago toEnum(Integer codigo) {
		
		for(EstadoPago x : EstadoPago.values()) {
			if(codigo == x.getCodigo()) 
				return x;
			
			throw new IllegalArgumentException("Id invalida:"+codigo);
		}
		
		return null;
	}

}
