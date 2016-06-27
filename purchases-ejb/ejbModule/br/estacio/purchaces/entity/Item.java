package br.estacio.purchaces.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Produto produto;
	
	private Integer quantidade;

	@ManyToOne
	@JoinColumn(name="pedido_id", referencedColumnName="id")
	private Pedido pedido;
	
	public Item(){
		
	}
	
	public Item(Integer id, Produto produto, Integer quantidade, Pedido pedido) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
