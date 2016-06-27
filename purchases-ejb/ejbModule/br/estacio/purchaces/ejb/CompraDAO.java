package br.estacio.purchaces.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.estacio.purchaces.entity.Item;
import br.estacio.purchaces.entity.Produto;

@Stateless
public class CompraDAO implements CompraService{
	
	@PersistenceContext(unitName="trabalho-pu")
	private EntityManager em;

	@Override
	public void adicionarItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto[] getProdutos() {
		return null;
	}

	@Override
	public List<Item> getItens() {
		// TODO Auto-generated method stub
		return null;
	}

}
