package com.example.demo.repository;

import com.example.demo.modelo.Item;

public interface IItemRepo {
	public void insertar(Item item);
	public Item buscar(String codigo);
	public void actualizar(Item item);
	public Item busquedaCriteria(String codigo);
	
}
