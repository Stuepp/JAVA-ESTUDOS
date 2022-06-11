package br.com.pessoa;

public class Aluno extends Pessoa {//Herança - Aluno extends Pessoa.
	private double nota1; //atributos privados.
	private double nota2;
	private double media;
	
	
	public Aluno(String nome) {
		super(nome); //envia nome para classse pessoa.
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public double calcularMedia() {//calcular média
		return this.media = (this.nota1 + this.nota2) / 2;
	}
	@Override //sobrescrita do mpetodo imprime da classe pessoa;
	public String imprimir() {
		String texto = "*************\nAluno(a): " + this.getNome();
		calcularMedia();
		if(this.media <= 5) {
			texto += "\nReprovado(a)\nMédia: " + this.media;
		} if (this.media < 7 && this.media >= 5.50) {
			texto += "\nRecuperação\nMédia: " + this.media;
		} if (this.media >= 7) {
			texto += "\nAprovado(a)\nMédia: " + this.media;
		} if (this.media > 9 && this.media < 10) {
			texto += "\n Parabéns";
		} if (this.media == 10) {
			texto += "\n Perfeito";
		}
		return texto;
	}
}
