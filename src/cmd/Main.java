package cmd;

import app.Cliente;
import app.Conta;
import app.ContaCorrente;
import app.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Nome cliente");
		
		Conta cc = new ContaCorrente(cliente);
		ContaPoupanca poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
	}

}
