package br.com.main;

import java.util.Scanner;
import br.com.contato.Contato;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite: Nome, sobrenome: ");
		String nome = s.nextLine();
		String sobrenome = s.nextLine();
				
		Contato contato1 = new Contato( nome, sobrenome);
		//
		System.out.println("Digite: Nome, sobrenome: ");
		nome = s.nextLine();
		sobrenome = s.nextLine();
		
		Contato contato2 = new Contato(nome, sobrenome);
		//
		System.out.println("Digite: Nome, sobrenome: ");
		nome = s.nextLine();
		sobrenome = s.nextLine();
		
		Contato contato3 = new Contato(nome, sobrenome);
		//
		
		System.out.println(contato1.imprimeContato());
		System.out.println(contato2.imprimeContato());
		System.out.println(contato3.imprimeContato());
		
	}

}
