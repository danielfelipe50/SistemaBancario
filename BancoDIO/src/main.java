public class main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta pp = new ContaPoupanca();
		
		cc.depositar(200);
		cc.transferir(75, pp);
		cc.imprimirExtrato();
		pp.imprimirExtrato();
	}

}
