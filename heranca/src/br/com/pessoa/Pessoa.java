package br.com.pessoa;

public class Pessoa {
	private String nome; //atributo privado.
	
	public Pessoa(String nome) {//construtor com parâmentro.
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String imprimir() {//imprimir pessoa
		return "Nome: " + this.nome;
	}
}
