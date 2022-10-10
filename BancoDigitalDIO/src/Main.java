
public class Main {

	public static void main(String[] args) {
		Cliente teste = new Cliente();
		teste.setNome("testeTitular");
		
		Conta cc = new ContaCorrente(teste);
		Conta poupanca = new ContaPoupanca(teste);

		cc.depositar(1000);
		cc.transferir(1000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
