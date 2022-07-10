import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> conta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String mone) {
		this.nome = mone;
	}
	public List<Conta> getConta() {
		return conta;
	}
	public void setConta(List<Conta> cont) {
		this.conta = cont;
	}
	
	
	
}
