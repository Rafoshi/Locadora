package qts.locadora;
import java.util.Date;
public class Locacao {
	private Cliente cliente;
	private Jogo jogo;
	private Date retirada;
	private Date devolucao;
	private double valor;
	
	public Locacao() {}
	
	public Locacao (Cliente cliente, Jogo jogo, Date retirada, Date devolucao, double valor) {
		super();
		this.cliente = cliente;
		this.jogo = jogo;
		this.retirada = retirada;
		this.devolucao = devolucao;
		this.valor = valor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Jogo getJogo() {
		return jogo;
	}
	
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
	public Date getRetirada() {
		return retirada;
	}
	
	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}
	
	public Date getDevolucao () {
		return devolucao;
	}
	
	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

}
