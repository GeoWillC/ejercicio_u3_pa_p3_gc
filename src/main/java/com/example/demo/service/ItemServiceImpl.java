package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;
import com.example.demo.repository.IItemRepo;

@Service
public class ItemServiceImpl implements IItemService{

	@Autowired
	private IItemRepo iItemRepo; 
	
	@Override
	public void agregar(Item item) {
		// TODO Auto-generated method stub
		//Sumar
		Item itemEncontrado=this.iItemRepo.buscar(item.getCodigoBarras());
		if(itemEncontrado.equals(null)) {
			System.out.println("Item no encontrado en base de datos agregando...");
			this.iItemRepo.insertar(item);
		}else {
			System.out.println("Item en base de datos agregando");
			itemEncontrado.setStock(itemEncontrado.getStock()+item.getStock());
			this.iItemRepo.actualizar(itemEncontrado);
		}
		
	}
	@Override
	public Item encontrar(String codigo) {
		// TODO Auto-generated method stub
		return this.iItemRepo.buscar(codigo);
	}
	@Override
	public Item encontrarCriteria(String codigo) {
		
		return this.iItemRepo.busquedaCriteria(codigo);
	}

}
