package br.com.condominio.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.condominio.dao.CondominioDao;

public class CondominioController {
	
	public String retornaDados(String email) {
		CondominioDao dao = new CondominioDao();
		String dadosFormatados = FormataDados(dao.filtroDadosUsuario(email));
		return dadosFormatados;
	}
	
	private static String FormataDados(Map<String, Integer> buscaDados) {
		List<String> list= new ArrayList<>();
		StringBuilder dadosFormatados = new StringBuilder("");
		
		buscaDados.forEach((permissoes, idCondominio) -> {
			list.add(idCondominio + ";" + permissoes);
		});
		
		for (String l : list) {
			dadosFormatados.append(l).append("\n");
		}
		
		if(dadosFormatados == null || dadosFormatados.toString().equals(""))	
			dadosFormatados.append("Email nao cadastrado!");
		
		System.out.println(dadosFormatados);
		
		return dadosFormatados.toString();
			
	}
}
