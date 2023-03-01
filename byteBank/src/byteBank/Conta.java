package byteBank;

class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean sacar(double valor) {

		if(saldo >= valor) {
			this.saldo = saldo - valor;
			return true;
		} 
		else{
			return false;
		}
	}
	
	public void transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return;
		}
	}
	
}