public class ContaCorrente implements Conta {

	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= (valor + 0.10);
	}

	public void atualiza(double taxaSelic) {
		this.saldo = this.getSaldo() * taxaSelic;
	}
}
