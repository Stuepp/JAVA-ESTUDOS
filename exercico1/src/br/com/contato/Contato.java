package br.com.contato;

public class Contato {
	//atributos
	String nome, sobrenome, email;
	int telefone;
	
	//construtor
	public Contato(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	//get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	//métodos
	public String imprimeContato() {
		String texto = "*******************\n******CONTATO******";
		
		if(this.nome != null) {
			texto = texto + "\nNome: " + this.nome;
		} if(this.sobrenome != null) {
			texto = texto + "\nSobrenome: " + this.sobrenome;
		} 
		return texto;
	}
}
