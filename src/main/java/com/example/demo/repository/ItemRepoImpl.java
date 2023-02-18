package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ItemRepoImpl implements IItemRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.persist(item);
	}

	@Override
	public Item buscar(String codigo) {
		// TODO Auto-generated method stub
		//Reutilizable -> named
		Query myQuery=this.entityManager.createNamedQuery("Buscar.codigoBarra"
				,Item.class);
		myQuery.setParameter("datoCodigo", codigo);
		return (Item)myQuery.getResultList().get(0);
	}
	@Override
	public void actualizar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.merge(item);
	}

	@Override
	public Item busquedaCriteria(String codigo) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Item> myQuery=myBuilder.createQuery(Item.class);
		Root<Item> myRoot=myQuery.from(Item.class);
		Predicate condicion=myBuilder.equal(myRoot.get("codigoBarras"),codigo);
		myQuery.select(myRoot).where(condicion);
		TypedQuery<Item> sql=this.entityManager.createQuery(myQuery);
		return sql.getSingleResult();
	}

}
