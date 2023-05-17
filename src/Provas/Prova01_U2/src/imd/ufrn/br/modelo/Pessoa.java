package imd.ufrn.br.modelo;

public class Pessoa {
	private String nome;
	private double salario;
	private ContaCorrente conta;
	private SeguroVida seguro;
	
	public Pessoa() {
	}
	
	public double bens()
	{
		return ((conta.getSaldo() * 0.38) + 31.50);
	}
	
	public double imposto()
	{
		return salario * (11 / 100);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public ContaCorrente getConta() {
		return conta;
	}

	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}

	public SeguroVida getSeguro() {
		return seguro;
	}

	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}
	
	
}
