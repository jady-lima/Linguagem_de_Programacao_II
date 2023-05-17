package imd.ufrn.br.dao;

import java.util.ArrayList;

import imd.ufrn.br.modelo.ContaCorrente;
import imd.ufrn.br.modelo.ITributavel;
import imd.ufrn.br.modelo.Pessoa;

public class PessoaDAO implements ITributavel{
	private ArrayList<Pessoa> pessoas;

	public PessoaDAO() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	//Método de cadastro de uma nova pessoa
	public void cadastraPessoa(Pessoa p)
	{
		pessoas.add(p);
		System.out.println("Pessoa adicionada!");
	}
	
	//Método de remoção de uma pessoa
	public void removerPessoa(Pessoa p)
	{
		pessoas.remove(p);
	}
	
	//Método de listagem da pessoa no array
	public void listaPessoas()
	{
		for (Pessoa pessoa : pessoas) {
			System.out.println("*****************************************************************************************************************************************************");
			System.out.println("Nome...: " + pessoa.getNome() + " Salario.: " + pessoa.getSalario());
			System.out.println("Agência: " + pessoa.getConta().getAgencia() + " Conta.: " + pessoa.getConta().getNumero() + " Saldo.: " + pessoa.getConta().getSaldo());
			System.out.println("Seguro.: " + pessoa.getSeguro().getNumero() + " Beneficiário: " + pessoa.getSeguro().getBeneficiado());
			System.out.println("Valor Seguro: " + pessoa.getSeguro().getValor());
		}
		System.out.println("*****************************************************************************************************************************************************");
	}
	
	//Método que calcula tributo de pessoa
	public double calcularTributos()
	{
		double imposto = 0;
		for (Pessoa pessoa : pessoas) {
			System.out.println("*****************************************************************************************************************************************************");
			System.out.println("Nome: " + pessoa.getNome() + "INPF...: " + pessoa.imposto());
			imposto = pessoa.imposto();
		}
		System.out.println("*****************************************************************************************************************************************************");
		return imposto;
	}
	
	//Método que imprime o imposto total
	public void impostoTotal()
	{
		totalImposto();
		System.out.println("Pessoa com maior IRPF a pagar: " + pessoas.get(maiorImposto()).getNome());
		System.out.println("Valor: " + pessoas.get(maiorImposto()).imposto());
		System.out.println("Maior beneficiario: " + pessoas.get(maiorSeguro()).getSeguro().getBeneficiado());
		System.out.println("Valor Beneficio: " + pessoas.get(maiorSeguro()).getSeguro().getValor());
	}
	
	//Método de calculo do total do imposto
	public void totalImposto()
	{
		double total = 0;
		for (Pessoa pessoa : pessoas) {
			total += pessoa.bens();
		}
		System.out.println("Total de imposto recolhido: " + total);
	}
	
	//Método auxiliar para encontrar o maior imposto
	public int maiorImposto()
	{
		int indice = 0;
		Pessoa p = new Pessoa();
		for (int i = 0; i < pessoas.size() ; i++) {
			if(pessoas.get(i).imposto() > p.imposto())
			{
				p.setNome(pessoas.get(i).getNome());
				p.setConta(pessoas.get(i).getConta());
				p.imposto();
				indice = i;
			}
		}
		return indice;
	}
	
	//Método auxiliar para encontrar o maior seguro
		public int maiorSeguro()
		{
			int indice = 0;
			Pessoa p = new Pessoa();
			for (int i = 0; i < pessoas.size() ; i++) {
				if(pessoas.get(i).getSeguro().getValor() > p.getSeguro().getValor())
				{
					p.setNome(pessoas.get(i).getNome());
					p.setSeguro(pessoas.get(i).getSeguro());
					indice = i;
				}
			}
			return indice;
		}
}
