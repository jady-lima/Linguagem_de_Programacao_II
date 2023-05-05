package br.ufrn.imd.controle;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Animal;
import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Girafa;
import br.ufrn.imd.modelo.Tigre;

public class AnimalDAO 
{
	private ArrayList<Animal> animais;
	
	public AnimalDAO()
	{
		animais = new ArrayList<Animal>();
	}
	
	//Adiciona os animais as jaulas/array
	public void addAnimal(Animal animal)
	{
		animais.add(animal);
	}
	
	//Retorna a quantidade de animais nas jaulas/array
	public int quantidadeAnimais()
	{
		return animais.size();
	}
	
	//Remove um animal pelo numero da jaula
	public void removeAnimal(int indice)
	{
		if(indice < 0)
		{
			System.out.println("Numero incorreto");
		}
		else if(indice < quantidadeAnimais())
		{
			animais.remove(indice);
			System.out.println("Animal removido!");
		}
		else 
		{
			System.out.println("Numero de jaula incorreto!");
		}
	}
	
	//Lista todos os animais
	public void listaAnimais()
	{
		System.out.println("----------Lista de animais no Zoo----------");
		for (Animal animal : animais) 
		{
			System.out.println("Nome de animal: " + animal.getNome());
			System.out.println("Data de nascimento do animal: " + animal.getDataNascimento());
			System.out.println("Peso do animal: " + animal.getPeso());
			System.out.println("Animal esta alimentado: " + animal.isAlimentado());
			System.out.println("Alimentacao do animal: " + animal.getAlimentacao());
			System.out.println("Idade do animal: " + animal.calcularIdade(animal));
		}
	}

	//Lista a quantidade de alimentação de animais herbivoros
	public double alimentacaoHerbivoros()
	{
		double alimentacaoTotal = 0;
		for (Animal animal : animais) {
			if (animal instanceof Elefante)
			{
				alimentacaoTotal += (animal.getPeso() * 0.15);
			}
			else if (animal instanceof Girafa)
			{
				alimentacaoTotal += (animal.getPeso() * 0.10);
			}
		}
		return alimentacaoTotal;
	}

	//Lista a quantidade de alimentação de animais carnivoros
	public double alimentacaoCarnivoros()
	{
		double alimentacaoTotal = 0;
		for (Animal animal : animais) {
			if (animal instanceof Tigre)
			{
				alimentacaoTotal += (animal.getPeso() * 0.15);
			}
		}
		return alimentacaoTotal;
	}
}
