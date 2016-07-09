package br.estacio.frameworks.service;

public class StatusPedidoResult {

	private Integer id;
	private String status;
	
	public StatusPedidoResult(){}
	
	public StatusPedidoResult(Integer id, String status) {
		this.id = id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
