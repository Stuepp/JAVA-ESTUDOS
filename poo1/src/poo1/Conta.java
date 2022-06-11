package poo1;

public class Conta {
	//atributos
	private double numAgencia, numConta, saldo;
	
	//construtor
	public Conta(double numAgencia, double numConta, double saldo) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	//m�todos
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;	
	}
	public double sacar(double valorParaSacar) {
		if(valorParaSacar <= this.saldo) {
			this.saldo = this.saldo - valorParaSacar;
			return valorParaSacar;
		} else {
			return 0;
		}
		
	}
	
	//m�todo extrato
	public void extrato() {
		System.out.println("*****EXTRATO******");
		System.out.println("Saldo em conta: " + this.saldo);
		System.out.println("N�mero da conta: " + this.numConta);
		System.out.println("N�mero da Ag�ncia: " + this.numAgencia);
	}
}
