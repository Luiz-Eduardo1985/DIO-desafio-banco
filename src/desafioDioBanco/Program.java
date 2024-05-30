package desafioDioBanco;

public class Program {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Luiz Eduardo");
	
		Conta cc1 =new ContaCorrente(cliente1);
	
		Conta cp1 =new ContaPoupanca(cliente1);
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
		
		
		cc1.depositar(1000);
		cc1.transferir(250, cp1);
		
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
		
		
		
		
	}

}
