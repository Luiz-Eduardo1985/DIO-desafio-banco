package desafioDioBanco;

public class ContaCorrente  extends Conta{
		
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtrato() {
		System.out.println("___Extrato conta Poupança___");
		super.imprimirInfoComuns();
	}


	}
