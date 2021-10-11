package br.com.condominio.busca.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.condominio.controller.CondominioController;

//http://localhost:8080/condominio
@Path("condominio")
public class condominioResource {
	
	@GET
	public String busca() {
	   return "hello"; 
	}	
	
	@Path("{email}")
	@GET
	public String busca(@PathParam("email") String email) {
	   CondominioController cond = new CondominioController();
	   String permissoesUsuario = cond.retornaDados(email);
	   return permissoesUsuario; 
	}
}
