
public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("IIIII Extrato conta poupanca: IIIII");
		super.imprimirInformsComuns();
	}

	

}

