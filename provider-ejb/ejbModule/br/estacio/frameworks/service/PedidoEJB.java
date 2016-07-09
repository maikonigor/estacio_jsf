package br.estacio.frameworks.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@Remote(StatusService.class)
@WebService
public class PedidoEJB implements StatusService {

	@WebMethod
	public List<StatusPedidoResult> consultarStatus(Integer[] pedidos) {
		List<StatusPedidoResult> listaResultados = new ArrayList<>();
		for(Integer pedido : pedidos){
			StatusPedidoResult statusResult = new StatusPedidoResult(pedido, gerarStatus());
			listaResultados.add(statusResult);
		}
		
		return  listaResultados;
	}
	
	private String gerarStatus(){
		String status = new String();
		Random rn = new Random();
		int n = (int)(Math.random() * 4) + 1;
		
		switch(n){
			case 1: status = "PENDENTE"; break;
			case 2: status = "PROCESSANDO"; break;
			case 3: status = "PROVADO"; break;
			case 4: status = "FINALIZADO"; break;
			default: status = "PENDENTE";
		}
		return status;
	}

	

}
