package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;

@Service
public interface IItemService {
	public void agregar(Item item);
	public Item encontrar(String codigo);
	public Item encontrarCriteria(String codigo); 
	
}
