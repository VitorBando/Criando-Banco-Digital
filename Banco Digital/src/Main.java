
public class Main {
	
	public static void main(String[] args) {
		Cliente vitor = new Cliente();
		vitor.setNome("Vitor");
		
		IConta cc = new ContaCorrente(vitor);
		cc.depositar(100);
		
		IConta cp = new ContaPoupanca(vitor);
		
		cc.transferir(100, cp);
		

		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}


