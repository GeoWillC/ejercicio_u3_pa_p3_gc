package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Item;
import com.example.demo.modelo.ProductoNuevo;
import com.example.demo.service.IItemService;

@SpringBootApplication
public class EjercicioU3PaP3GcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU3PaP3GcApplication.class, args);
	}

	@Autowired
	private IItemService iItemService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Item item=new Item();
		item.setCodigoBarras("123");
		item.setId(1);
		item.setNombre("Lomo");
		item.setPrecio(new BigDecimal(2));
		item.setStock(100);
		item.setTipo("Carne");
		this.iItemService.agregar(item);
		item.setStock(20);
		this.iItemService.agregar(item);
		List<ProductoNuevo> lista=new  ArrayList<>();
		ProductoNuevo p=new ProductoNuevo();
		p.setCantidad(10);
		p.setCodigoBarra("123");
		
		lista.add(p);
		
//		System.out.println(this.iItemService.encontrar("123"));
	}

}
