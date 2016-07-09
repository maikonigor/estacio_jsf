package br.estacio.frameworks.service;

import java.util.List;

public interface StatusService {

	public List<StatusPedidoResult> consultarStatus(Integer[] pedidos);
}
