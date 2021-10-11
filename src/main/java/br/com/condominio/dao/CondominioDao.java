package br.com.condominio.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CondominioDao {
	
	public Map<String,Integer> filtroDadosUsuario(String email) {
		String retorno = "";
		Map<String, Integer> buscaDados= new HashMap<>(); 
		
		try (Scanner scan = new Scanner(new File("C:\\Arquivos\\baseDados.csv"))){
			while(scan.hasNext()) {
				String linha = scan.next();
				
				if(linha.contains(email)) {
					String[] dados = linha.split(";");
					
					if(dados[2].contains("(Morador, 1)")) {
						retorno = buscaPermissoes("Morador", "1"); 
						buscaDados.put(retorno,1);
					}
					if(dados[2].contains("(Sindico,1)")) {
						retorno = buscaPermissoes("Sindico", "1");
						buscaDados.put(retorno, 1);
					}
					if(dados[2].contains("(Sindico,2)")) {
						retorno = buscaPermissoes("Sindico", "2");
						buscaDados.put(retorno, 2);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
		return buscaDados;
	}
	
	private static String buscaPermissoes(String tipoUsuario, String id) {
		String permissoes = "";
		
		try (Scanner scan = new Scanner(new File("C:\\Arquivos\\baseDados.csv"))){
			
			String[] tipcoEId = tipoUsuario.split(",");
			
			while(scan.hasNext()) {
				String linha = scan.next();
				
				if(linha.contains("Grupo")) {
					String[] dados = linha.split(";");
					
					if(dados[1].contains(tipcoEId[0]) && dados[2].equals(id)) {
						permissoes = dados[3];
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return permissoes;
	}
	
	
	
	
}
