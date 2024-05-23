package curso_programacao;

public class Account {

	private int numero;
	private String nome;
	private double valor;
	
	
	public Account(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
						
	}

	public Account(int numero, String nome, double ValorInicial) {
		this.numero = numero;
		this.nome = nome;
		deposit(ValorInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}
	
	public void deposit (double amount) {
		valor += amount;
	}
	public void withdraw (double amount) {
		valor -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: "+ numero+ ", Nome: "
				+ nome 
				+ ", Valor:"
				+ String.format("%.2f", valor);
				
				
		
	}
	
	}

