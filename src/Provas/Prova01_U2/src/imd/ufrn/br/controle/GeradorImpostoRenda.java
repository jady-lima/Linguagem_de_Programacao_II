package imd.ufrn.br.controle;

import imd.ufrn.br.modelo.Pessoa;

public class GeradorImpostoRenda {
	public double calculaValorTotalTibuto(Pessoa p)
	{
		double total = 0;
		total = p.getSalario() + p.bens() + p.getConta().getSaldo() + p.getSeguro().getValor();
		return total;
	}
}
