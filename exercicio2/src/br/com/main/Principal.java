package br.com.main;

import java.util.Scanner;
import br.com.musica.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o nome da música: ");
		String nome_musica = s.nextLine();
		
		Musica musica1 = new Musica(nome_musica);
		//
		System.out.println("Insira o nome da música: ");
		nome_musica = s.nextLine();
		
		Musica musica2 = new Musica(nome_musica);
		//
		System.out.println("Insira o nome da música: ");
		nome_musica = s.nextLine();
		
		Musica musica3 = new Musica(nome_musica);
		//
		System.out.println("Insira o nome da música: ");
		nome_musica = s.nextLine();
		
		Musica musica4 = new Musica(nome_musica);
		//
		System.out.println(musica1.imprimeMusica());
		System.out.println(musica2.imprimeMusica());
		System.out.println(musica3.imprimeMusica());
		System.out.println(musica4.imprimeMusica());
	}

}
