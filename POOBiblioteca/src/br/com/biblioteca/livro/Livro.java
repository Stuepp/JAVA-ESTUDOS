package br.com.biblioteca.livro;

public class Livro {
	//atributos
	private String isbn, titulo, autor, editora, genero;
	private int ano;
	
	//contrutor
	public Livro(String isbn, String titulo, int ano) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
	}
	//get and set
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//métodos
	public String mostraLivro() {
		String texto = "*************\nLIVRO \nISBN: " + this.isbn
				+"\nTítulo: " + this.titulo
				+ "\nAno: " + this.ano;
		
		if(this.autor != null) {
			texto = texto + "\nAutor: " + this.autor;
		} if (this.editora != null) {
			texto = texto + "\nEditora: " + this.editora;
		} if (this.genero != null) {
			texto = texto + "\nGenêro: " + this.genero;
		}
		return texto;
	}
}
