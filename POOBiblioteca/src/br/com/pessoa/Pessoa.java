package br.com.pessoa;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Pessoa {
	//atributos

	private int codigo;
	private String nome, sobrenome;
	private Date dataNascimento;

	DateFormat df = new SimpleDateFormat("dd/MM/yy");
	Date dateobj = new Date();
	//System.out.println(df.format(dateobj);
	
	//construtor
	public Pessoa(String nome, String sobrenome, int codigo, Date dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.codigo = codigo;
		this.dataNascimento = dataNascimento;
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
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	//método
	public String imprimePessoa() {
		String texto = "*******************\n*******PESSOA******";
		if(this.codigo != null){
			texto = texto + "\nCódigo: " + this.codigo;
		}
			if(this.nome != null) {
			texto = texto + "\nNome: " + this.nome;
		} if(this.sobrenome != null) {
			texto = texto + "\nSobrenome: " + this.sobrenome;
		} if(this.dataNascimento != null) {
			texto = texto + "\nData de Nascimento: " + this.dataNascimento;
		}
		return texto;
	}
}
