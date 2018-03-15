package com.williams.example.CursoSpringIo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.williams.example.CursoSpringIo.entity.Categoria;
import com.williams.example.CursoSpringIo.entity.Ciudad;
import com.williams.example.CursoSpringIo.entity.Cliente;
import com.williams.example.CursoSpringIo.entity.Direccion;
import com.williams.example.CursoSpringIo.entity.Estado;
import com.williams.example.CursoSpringIo.entity.Producto;
import com.williams.example.CursoSpringIo.enums.TipoCliente;
import com.williams.example.CursoSpringIo.repository.CategoriaRepository;
import com.williams.example.CursoSpringIo.repository.CiudadRepository;
import com.williams.example.CursoSpringIo.repository.ClienteRepository;
import com.williams.example.CursoSpringIo.repository.DireccionRepository;
import com.williams.example.CursoSpringIo.repository.EstadoRepository;
import com.williams.example.CursoSpringIo.repository.ProductoRepository;

@SpringBootApplication
public class CursoSpringIoApplication implements CommandLineRunner{
	
	@Autowired 
	private CategoriaRepository catRepo;
	@Autowired 
	private ProductoRepository proRepo;
	@Autowired 
	private EstadoRepository estRepo;
	@Autowired 
	private CiudadRepository ciuRepo;
	@Autowired 
	private ClienteRepository cliRepo;
	@Autowired 
	private DireccionRepository dirRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringIoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 =  new Categoria(null,"Informatica");
		Categoria cat2 =  new Categoria(null,"Escritorio");
		
		Producto p1 = new Producto(null,"Computadora",2000.00);
		Producto p2 = new Producto(null,"Impresora",800.00);
		Producto p3 = new Producto(null,"Mouse",80.00);
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		cat1.getProductos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProductos().addAll(Arrays.asList(p2));

		catRepo.save(Arrays.asList(cat1,cat2));

		proRepo.save(Arrays.asList(p1,p2,p3));
		
		Estado est1 = new Estado(null,"TABASCO");
		Estado est2 = new Estado(null,"VERACRUZ");
		
		Ciudad c1 = new Ciudad(null,"Cardenas",est1);
		Ciudad c2 = new Ciudad(null,"Chole",est2);
		Ciudad c3 = new Ciudad(null,"Huimanguillo",est1);

		est1.getCiudades().addAll(Arrays.asList(c1,c3));
		est2.getCiudades().addAll(Arrays.asList(c2));
		
		estRepo.save(Arrays.asList(est1,est2));
		
		ciuRepo.save(Arrays.asList(c1,c2,c3));
		
		Cliente cli1 = new Cliente(null,"Maria Silva","maria@gmail.com","WOECVKDFEJFN",TipoCliente.PERSONAFISICA);

		cli1.getTelefonos().addAll(Arrays.asList("7534567424","6534563456"));
		
		Direccion d1 = new Direccion(null,"San Faustino","586","Casa amarilla","Santa Ursula","04600",cli1,c1);
		Direccion d2 = new Direccion(null,"San Hermilio","234","Casa roja","Santa Ursula","04500",cli1,c2);
		
		cli1.getDirecciones().addAll(Arrays.asList(d1,d2));
		
		cliRepo.save(Arrays.asList(cli1));
		dirRepo.save(Arrays.asList(d1,d2));
		
		


		
	}
}
