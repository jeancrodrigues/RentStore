package com.rentstore.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.rentstore.model.Cliente;

@Stateless
public class ClienteDaoImpl implements IClienteDao{
	
	@PersistenceContext(unitName=PersUnit)
	private EntityManager em;
	
	@Override
	public Cliente save(Cliente cliente) {
		return em.merge(cliente);
	}
	
	@Override
	public Cliente get(int primaryKey) {
		return em.find(Cliente.class, primaryKey);
	}
	
	@Override
	public void update(Cliente cliente) {
		em.merge(cliente);
	}
	
	@Override
	public void delete(Cliente cliente) {
		em.remove(em.getReference(Cliente.class, cliente.getIdcliente()));
	}
	
	@Override
	public List<Cliente> listAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Cliente> criteria = cb.createQuery(Cliente.class);
        Root<Cliente> cli = criteria.from(Cliente.class);
        criteria.select(cli).orderBy(cb.asc( cli.get("pessoafisica").get("nome") ));
        return em.createQuery(criteria).getResultList();
	}
	
	@Override
	public Cliente buscarPorCPF(String cpf) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Cliente> criteria = cb.createQuery(Cliente.class);
        Root<Cliente> cli = criteria.from(Cliente.class);
        criteria.select(cli).where(cb.equal(cli.get("pessoafisica").get("cpf"), cpf));
        return em.createQuery(criteria).getSingleResult();
	}

	@Override
	public Cliente buscarPorCnpj(String cnpj) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Cliente> criteria = cb.createQuery(Cliente.class);
        Root<Cliente> cli = criteria.from(Cliente.class);
        criteria.select(cli).where(cb.equal(cli.get("pessoajuridica").get("cnpj"), cnpj));
        return em.createQuery(criteria).getSingleResult();
	}
}
