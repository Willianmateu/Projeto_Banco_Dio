
public abstract class Conta implements IntConta{
	
	private static int AGENCIA_SEQUENCIAL = 4;
	
	private static int SEQUENCIAL = 1;
	
	protected int conta;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;
	
	

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_SEQUENCIAL++;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}
		
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	public int getConta() {
		return conta;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInformsComuns() {
		System.out.println("Titular: "+this.cliente.getNome());
		System.out.println("Agencia: "+this.agencia);
		System.out.println("Conta: "+this.conta);
		System.out.println("Saldo: "+this.saldo);
	}



	
	
	
}
