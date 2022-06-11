package br.com.biblioteca.main;

import java.util.Scanner;

import br.com.biblioteca.livro.Livro;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite isbn, titulo e ano do livro: ");
		String isbn = s.nextLine();
		String titulo = s.nextLine();
		int ano = s.nextInt();
		
		Livro livro1 = new Livro(isbn, titulo, ano);
		
		System.out.println(livro1.mostraLivro());
		
		System.out.println("Digite o código, nome, sobrenome e data de nascimento: ");
		int codigo = s.nextInt();
		String nome = s.nextLine();
		String sobrenome = s.nextLine();
		Date dataNasciemtno = s.nextDate();
		
		s.close();
	}

}
