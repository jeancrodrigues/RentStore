package com.rentstore.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.rentstore.model.Compra;

@Stateless
public class CompraDaoImpl implements ICompraDao{
	
	@PersistenceContext(unitName=PersUnit)
	private EntityManager em;
	
	@Override
	public Compra save(Compra compra) {
		return em.merge(compra);
	}
	
	@Override
	public Compra get(int primaryKey) {
		return em.find(Compra.class, primaryKey);
	}
	
	@Override
	public void update(Compra compra) {
		em.merge(compra);
	}
	
	@Override
	public void delete(Compra compra) {
		em.remove(em.getReference(Compra.class, compra.getIdcompra()));
	}
	
	@Override
	public List<Compra> listAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Compra> criteria = cb.createQuery(Compra.class);
        Root<Compra> com = criteria.from(Compra.class);
        criteria.select(com).orderBy(cb.asc( com.get("veiculo").get("modelo") ));
        return em.createQuery(criteria).getResultList();
	}
	
	@Override
	public Compra buscarPorCompra (String idCompra){
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Compra> criteria = cb.createQuery(Compra.class);
        Root<Compra> com = criteria.from(Compra.class);
        criteria.select(com).where(cb.equal(com.get("idCompra"), idCompra));
        return em.createQuery(criteria).getSingleResult();	
	}
	
	@Override
	public Compra buscarPorVeiculo (String chassi){
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Compra> criteria = cb.createQuery(Compra.class);
        Root<Compra> com = criteria.from(Compra.class);
        criteria.select(com).where(cb.equal(com.get("veiculo").get("chassi"), chassi));
        return em.createQuery(criteria).getSingleResult();	
		
	}
	

}
