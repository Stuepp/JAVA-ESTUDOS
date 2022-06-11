package br.com.pessoa;

public class Professor extends Pessoa{
	//atributos
	private int workedHours;
	private double cashPerHour;
	private double salary;
	
	//contrutor
	public Professor(String nome) {
		super(nome);
	}
	//getters and setters
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	public double getCashPerHour() {
		return cashPerHour;
	}
	public void setCashPerHour(double cashPerHour) {
		this.cashPerHour = cashPerHour;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//métodos
	public double calcularSalario() {
		return this.salary = this.workedHours * this.cashPerHour;
	}
	//sobrescrita
	@Override
	public String imprimir() {
		String texto = "*************\nProfessor(a): " + this.getNome();
		calcularSalario();
		texto += "\nSalário: " + this.salary;
		texto += "\nHoras trabalhadas: " + this.workedHours;
		texto += "\nCusto da hora: " + this.cashPerHour;
		return texto;
	}
}
