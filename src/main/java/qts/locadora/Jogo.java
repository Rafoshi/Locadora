package qts.locadora;

public class Jogo {
	private String nome;
	private double valor;
	private int qtsestoque;
	
	public Jogo(String nome, double valor, int qtsestoque) {
		this.nome = nome;
		this.valor = valor;
		this.qtsestoque = qtsestoque;
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
	
	public int getQtsestoque() {
		return qtsestoque;
	}
	
	public void setQtsestoque(int qtsestoque) {
		this.qtsestoque = qtsestoque;
	}
}
