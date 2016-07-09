package br.estacio.purchaces.bean;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.estacio.purchaces.ejb.CompraService;
import br.estacio.purchaces.entity.Item;
import br.estacio.purchaces.entity.Produto;

@ManagedBean
@SessionScoped
public class CompraBean {

	private int quantidade;
	private Integer idProdutoSelecionado;
	private Produto produtoSelecionado;
	private List<Item> itensAdicionados;
	
	@EJB
	private CompraService compraService;
	
	public CompraBean() {
		quantidade = 0;
		itensAdicionados = new ArrayList<>();
	}
	
	public void adicionarLista(int quantidade){
		Produto produtoSelecionado = compraService.getProduto(idProdutoSelecionado);
		Item item = new Item(produtoSelecionado, quantidade);
		itensAdicionados.add(item);
		this.quantidade = quantidade;
	}
	
	
	public List<Produto> getProdutos() {
		List<Produto> produtos = compraService.getProdutos();
		return produtos;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public List<Item> getItensAdicionados() {
		return itensAdicionados;
	}
	
	public void setItensAdicionados(List<Item> itensAdicionados) {
		this.itensAdicionados = itensAdicionados;
	}

	public Integer getIdProdutoSelecionado() {
		return idProdutoSelecionado;
	}

	public void setIdProdutoSelecionado(Integer idProdutoSelecionado) {
		this.idProdutoSelecionado = idProdutoSelecionado;
	}
	
	
}
