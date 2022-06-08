package entities;

public class Account {
	
	private int number;
	private String name;
	private double deposite;
	
	public Account(int number, String name, double deposite) {
		this.number = number;
		this.name = name;
		deposite(deposite);
	}

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getDeposite() {
		return deposite;
	}
	
	public void deposite(double deposite) {
		this.deposite += deposite;
	}
	public void saque(double deposite) {
		this.deposite -= deposite + 5;
	}
	public String toString(){
		return "Conta: "
				+ number
				+ ", Nome do titular: "
				+ name
				+ ", Saldo: $"
				+ String.format("%.2f", deposite);
	}
		
}
