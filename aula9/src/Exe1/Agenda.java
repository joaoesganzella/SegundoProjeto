package Exe1;

import java.util.ArrayList;

public class Agenda {

	int cont,result;
	
	private ArrayList<Pessoa> listaPessoa = new ArrayList();		
	Pessoa p = new Pessoa();
	
	
	public void armazenarPessoa(String nome, int idade, double altura) {
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setIdade(idade);
		p.setAltura(altura);
		listaPessoa.add(p);
	}	
	
	public void removerPessoa(String nome) {
		for(cont = 0; cont < listaPessoa.size(); cont++) {
			Pessoa p = listaPessoa.get(cont);
			if(p.getNome().equals(nome)) {
				listaPessoa.remove(p);
				break;				
			}
			System.out.println("Pessoa "+nome+" foi removido. ");
		}		
	}	
	
	public int buscaPessoa(String nome) {
		for(cont = 0; cont < listaPessoa.size(); cont++) {
			Pessoa p = listaPessoa.get(cont);
			if(p.getNome().equals(nome)) {
				result = cont;
				break;
			}
		}
		return result;
	}
	
	public void imprimeAgenda() {
		for(cont = 0; cont < listaPessoa.size(); cont++) {
			Pessoa p = listaPessoa.get(cont);
			System.out.println("Pessoa "+cont+" : "+p.getNome() + ", idade: "+p.getIdade()+", altura: " + p.getAltura());
		}
	}
	
	public void imprime(String nome) {
		for(cont = 0; cont < listaPessoa.size(); cont++) {
			Pessoa p = listaPessoa.get(cont);
			if(p.getNome().equals(nome)) {
				System.out.println("Pessoa "+cont+" : "+p.getNome() + p.getIdade() + p.getAltura());
				break;
			}
		}
	}
	
}
