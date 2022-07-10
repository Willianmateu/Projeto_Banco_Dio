
public class Execut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criando cliente:
		Cliente cli = new Cliente();
		cli.setNome("WillianMateus");
		
		//Criando uma conta corrente com um cliente específico e realizando depósito:
		Conta cc = new ContaCorrente(cli);
		cc.depositar(100);
		//Mostrando o saldo da conta corrente após o depósito:
		cc.imprimirExtrato();
		
		//Criando uma conta poupança com um cliente específico:
		Conta cp = new ContaPoupanca(cli);
		//Mostrando o saldo da conta poupança:
		cp.imprimirExtrato();

		//Realizando a transferência do valor da conta corrente para a conta poupança:
		cc.transferir(10, cp);
		
		//Mostrando o saldo da conta poupança após receber a transferência:
		cp.imprimirExtrato();
		
		//Mostrando o saldo da conta corrente após a transferência do valor para a c. poupança:
		cc.imprimirExtrato();
	}

}
