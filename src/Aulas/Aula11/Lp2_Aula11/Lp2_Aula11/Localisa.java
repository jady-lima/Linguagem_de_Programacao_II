import Carro;
import Moto;

public class Localisa {

	public static void main(String[] args) {
		
		Repositorio banco = new Repositorio();
		
		Carro c = new Carro();
		c.setAlugado(true);
		c.setMarca("Chevrolet");
		c.setPlaca("AAA-8888");
		c.setPortas(4);
		c.setPotencia(1600);
		c.setValorAluguel(5 * 115.5);
		
		Carro c2 = new Carro();
		c2.setAlugado(true);
		c2.setMarca("Fiat");
		c2.setPlaca("ABB-1000");
		c2.setPortas(4);
		c2.setPotencia(1000);
		c2.setValorAluguel(1 * 75.0);
		
		Carro c3 = new Carro();
		//c3.setAlugado(false);
		c3.setMarca("Fiat");
		c3.setPlaca("ABC-5501");
		c3.setPortas(2);
		c3.setPotencia(1200);
		c3.setValorAluguel(5 * 75.0);
		
		Moto m = new Moto();
		//m.setAlugado(false);
		m.setMarca("Honda");
		m.setPlaca("BBB-2019");
		m.setCilindradas(850);
		m.setPartida("Elétrica");
		m.setValorAluguel(1 * 55.25);
				
		banco.addVeiculo(c);
		banco.addVeiculo(c2);
		banco.addVeiculo(c3);
		banco.addVeiculo(m);
		System.out.println("");
		
		banco.printVeiculos();
		System.out.println("");
		
		banco.printAlugados();
		System.out.println("");
		
		banco.printLivres(); 
	}
}
