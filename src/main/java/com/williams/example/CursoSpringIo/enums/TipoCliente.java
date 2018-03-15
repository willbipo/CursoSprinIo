package com.williams.example.CursoSpringIo.enums;

public enum TipoCliente {
	
	PERSONAFISICA(1,"Persona fisica"),
	PERSONAMORAL(2,"Persona Moral");
	
	private int codigo;
	private String descripcion;
	
	private TipoCliente(int codigo, String descripcion){
		this.codigo=codigo;
		this.descripcion=descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public static TipoCliente toEnum(Integer codigo) {
		
		for(TipoCliente x : TipoCliente.values()) {
			if(codigo == x.getCodigo()) 
				return x;
			
			throw new IllegalArgumentException("Id invalida:"+codigo);
		}
		
		return null;
	}
	
	


	
	
	
	
	

}
