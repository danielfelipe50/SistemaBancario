
public abstract class Conta implements IConta {
	
	private static final int AgenciaPadrao=1; 
	private static int SEQUENCIAL= 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		this.agencia = Conta.AgenciaPadrao;
		this.numero= SEQUENCIAL++;
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		saldo = saldo-valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo=saldo + valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}


}
