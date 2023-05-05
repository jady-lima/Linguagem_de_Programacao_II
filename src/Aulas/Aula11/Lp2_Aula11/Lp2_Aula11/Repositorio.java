import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import Moto;
import Carro;
import Veiculo;

public class Repositorio {
	
	private ArrayList<Veiculo> veiculos;
	private HashMap<String, Integer> map;
	
	public Repositorio() {
		veiculos = new ArrayList<Veiculo>();
		map = new HashMap<String, Integer>();
	}
	
	// método add
	public void addVeiculo(Veiculo v) {
		veiculos.add(v);
		System.out.println("Veiculo cadastrado!!!!");
	}
			
	// método remove
	public void removeVeiculo(Veiculo v){
		veiculos.remove(v);
	}
	
	// método para listar todos os veículos e
	// marca com maior numero de carros
	public void printVeiculos() {
		System.out.println("Lista de Veiculos:");
		for(Veiculo v: veiculos){
			System.out.println("Veiculo: " + v.getClass().getName() + 
					"\tMarca: " + v.getMarca() 
					+ "\tPlaca: " + v.getPlaca());
			
			if (v instanceof Carro) {
				if (map.containsKey(v.getMarca())) {
					map.put(v.getMarca(), map.get(v.getMarca())+1);
				}
				else {
					map.put(v.getMarca(), 1);
				}
			}
		}
		
		System.out.println("Marca com maior numero de carros:");
		System.out.println(Collections.max(map.entrySet(), 
				Map.Entry.comparingByValue()).getKey());	
	}
	
	// método para listar todos os veículos alugados
		public void printAlugados() {
			System.out.println("==============Alugados==============");
			double totalAlug = 0;
			for (Veiculo veiculo : veiculos) {
				if (veiculo.isAlugado()) {
					
					// somar valor aluguel
					totalAlug += veiculo.getValorAluguel();
					
					if (veiculo instanceof Moto) {
						System.out.println("Moto: " + veiculo.getMarca() + " Placa: " 
								+ veiculo.getPlaca() + " Partida: " 
								+ ((Moto) veiculo).getPartida() + " Cilindradas : "
								+ ((Moto) veiculo).getCilindradas());
					} else {
						System.out.println("Carro: " + veiculo.getMarca() + " Placa: " 
								+ veiculo.getPlaca() + " Motor : " 
								+ ((Carro) veiculo).getPotencia() + " Portas: "
								+ ((Carro) veiculo).getPortas());
					}
				}
			}
			System.out.println("Valor total dos alugueis: " + totalAlug);
			System.out.println("==============  Fim  ==============");
		}
		
		
		// método para listar todos os veículos livres
		public void printLivres() {
			
			double maiorPreco = 0;
	        int index = 0;

			System.out.println("==============Livres==============");

			for (Veiculo veiculo : veiculos) {
				if (!veiculo.isAlugado()) {
					if (veiculo instanceof Moto) {
						System.out.println("Moto: " + veiculo.getMarca() + " Placa: " 
								+ veiculo.getPlaca() + " Partida: " 
								+ ((Moto) veiculo).getCilindradas() + " Valor aluguel: "
								+ veiculo.getValorAluguel());
					} else {
						System.out.println("Carro: " + veiculo.getMarca() + " Placa: " 
								+ veiculo.getPlaca() + " Motor : " 
								+ ((Carro) veiculo).getPotencia() + " Portas: "
								+ ((Carro) veiculo).getPortas() + " Valor aluguel: "
								+ veiculo.getValorAluguel());
					}
				}
			}
	        
	        for (int i=0; i < veiculos.size(); i++) {
	        	double valorAtual = veiculos.get(i).getValorAluguel();
	        	if (valorAtual > maiorPreco) {
	        		maiorPreco = valorAtual;
	        		index = i;
	        	}
	        }
	    System.out.println("Veiculo com maior aluguel: " + veiculos.get(index).getPlaca());
		System.out.println("==============  Fim  ==============");
		}
		
		
	
}
