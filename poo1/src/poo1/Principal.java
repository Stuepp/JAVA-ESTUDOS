package poo1;

public class Principal {

	public static void main(String[] args) {
		//instancia objeto
		Conta conta1 = new Conta(12.00, 431, 100.00);//numAgencia, numConta, saldo
		conta1.extrato();
	}

}
