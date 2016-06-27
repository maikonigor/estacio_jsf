package br.estacio.purchaces.bean;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.estacio.purchaces.ejb.CompraService;
import br.estacio.purchaces.entity.Produto;

@ManagedBean
@SessionScoped
public class CompraBean {

	private int quantidade;
	private Produto produtoSelecionado;
	private List<Produto> produtosAdicionados;
	
	@EJB
	private CompraService compraService;
	
	public CompraBean() {
		quantidade = 0;
		produtosAdicionados = new ArrayList<>();
	}
	
	public void adicionarLista(int quantidade){
		produtosAdicionados.add(produtoSelecionado);
		this.quantidade = quantidade;
	}
	
	public Produto[] getProdutos() {
		Produto[] produtos = compraService.getProdutos();
		System.out.println(Arrays.toString(produtos));
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

	public List<Produto> getProdutosAdicionados() {
		return produtosAdicionados;
	}

	public void setProdutosAdicionados(List<Produto> produtosAdicionados) {
		this.produtosAdicionados = produtosAdicionados;
	}
	
}
