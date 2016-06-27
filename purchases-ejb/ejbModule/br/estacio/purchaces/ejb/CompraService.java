package br.estacio.purchaces.ejb;

import java.util.List;

import javax.ejb.Remote;

import br.estacio.purchaces.entity.Item;
import br.estacio.purchaces.entity.Produto;

@Remote
public interface CompraService {
	
	public void adicionarItem(Item item);

	public Double getTotal();

	public Produto[] getProdutos();
	
	public List<Item> getItens();

}
