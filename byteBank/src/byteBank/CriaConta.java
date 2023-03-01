package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Conta contaMarcelo = new Conta();
		
		//valores em conta
		minhaConta.depositar(100);
		contaMarcelo.depositar(3000);
	
		System.out.println(minhaConta.saldo);
		
		//saquei 20 reais aqui
		minhaConta.sacar(20);
	
		System.out.println(minhaConta.saldo);
		
		//Marcelo transferiu 300 reais para minha conta
		contaMarcelo.transferir(300, minhaConta);
		System.out.println(contaMarcelo.saldo);
		System.out.println(minhaConta.saldo);
	}

}
;