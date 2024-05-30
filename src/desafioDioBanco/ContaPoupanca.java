package desafioDioBanco;

public class ContaPoupanca extends Conta{
	

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	
	}

	@Override
	public void imprimirExtrato() {
	 	System.out.println("___Extrato conta Poupança___");
	 	super.imprimirInfoComuns();
	}
		
	}
	
	



