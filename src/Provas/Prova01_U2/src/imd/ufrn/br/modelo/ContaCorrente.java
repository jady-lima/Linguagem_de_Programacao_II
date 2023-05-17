package imd.ufrn.br.modelo;

public class ContaCorrente {
	private String agencia;
	private String numero;
	private double saldo;
	
	public ContaCorrente() {
	}
	
	//Método de saque
	public void sacar(double valor)
	{
		if(valor > getSaldo() || valor < 0)
		{
			System.out.println("Saldo insuficiente ou menor que 0!");
		}else {
			System.out.println("Saque de " + valor + " em [" + getNumero() + "] efetuado com sucesso!");
		}
	}
	
	//Método de deposito
	public void depositar (double valor)
	{
		setSaldo(getSaldo() + valor);
	}
	
	//Método de transferencia
	public boolean transferir(double valor, ContaCorrente cc)
	{
		if(valor > getSaldo() || valor < 0)
		{
			System.out.println("Saldo insuficiente ou menor que 0!");
			return false;
		}else {
			setSaldo(getSaldo() - valor);
			cc.setSaldo(cc.getSaldo() + valor);
			System.out.println("Transferindo " + valor + " para [" + cc.getNumero() + "].");
			return true;
		}
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
