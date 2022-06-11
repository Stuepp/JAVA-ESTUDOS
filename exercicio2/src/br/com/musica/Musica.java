package br.com.musica;

public class Musica {
	//atributos
	private String nome_musica, artista;
	private int data;
	
	//construtor
	public Musica(String nome_musica) {
		this.nome_musica = nome_musica;
	}
	//get and set
	public String getNome_musica() {
		return nome_musica;
	}
	public void setNome_musica(String nome_musica) {
		this.nome_musica = nome_musica;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	//método
	public String imprimeMusica() {
		String texto = "******************\n******Música******";
		if(this.nome_musica != null && this.nome_musica != "" && this.nome_musica != " ") {
			texto = texto + "\nNome: " + this.nome_musica;
		} else {
			return texto + "\nSem nome...";
		}
		return texto;
	}
}