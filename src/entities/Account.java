package entities;

public class Account {
	
	public static final double TAXA = -5.00;

	private int numero;
	private String titular;
	private double saldoIncial;
	
	public Account(int numero, String titular, double saldoIncial) {
		this.numero = numero;
		this.titular = titular;
		depositar(saldoIncial);
	}
	
	public Account(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldoIncial;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void depositar(double quantidade) {
		this.saldoIncial += quantidade;
	}
	
	public void retirar(double quantidade) {
		this.saldoIncial -= (quantidade - TAXA);
	}
	
	public String toString() {
		return "Conta "
			+ getNumero()
			+ ", Titular: "
			+ getTitular()
			+ ", Saldo: $ "
			+ String.format("%.2f%n", getSaldo());
	}
	
}
