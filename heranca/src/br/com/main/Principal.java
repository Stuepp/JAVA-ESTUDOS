package br.com.main;

import java.util.Scanner;
import br.com.pessoa.Aluno;
import br.com.pessoa.Professor;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome, nota 1 e nota 2 do aluno: ");
		String nome = s.nextLine();
		double nota1;
		double nota2; 
		try {
			nota1 = s.nextDouble();
			nota2 = s.nextDouble();
		} catch(Exception e) {
			System.out.println("Ocorreu um problema nota vai ser dada como 0.");
			nota1 = 0;
			nota2 = 0;
		}
		
		Aluno aluno1 = new Aluno(nome);
			aluno1.setNota1(nota1);
			aluno1.setNota2(nota2);
		
		System.out.println(aluno1.imprimir());
		//
		System.out.println("Digite seu nome, horas trabalhadas e custo da hora: ");
		nome = s.nextLine();
		int workedHours = s.nextInt();
		double cashPerHour = s.nextDouble();
		
		Professor professor1 = new Professor(nome);
		professor1.setWorkedHours(workedHours);
		professor1.setCashPerHour(cashPerHour);
		
		System.out.println(professor1.imprimir());
		
		s.close();
	}

}
