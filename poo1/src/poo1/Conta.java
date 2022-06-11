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
	
	//métodos
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
	
	//método extrato
	public void extrato() {
		System.out.println("*****EXTRATO******");
		System.out.println("Saldo em conta: " + this.saldo);
		System.out.println("Número da conta: " + this.numConta);
		System.out.println("Número da Agência: " + this.numAgencia);
	}
}
