package br.ufrn.imd.visao;

import br.ufrn.imd.controle.*;
import br.ufrn.imd.modelo.*;

public class ZoologicoView {

	public static void main(String[] args) 
	{
		Animal elefante1 = new Elefante("Elefante1", "10/03/2001", 145, false, "Frutas", 3);
		Animal elefante2 = new Elefante("Elefante2", "10/09/2010", 160, false, "Frutas", 3);

		Animal girafa1 = new Girafa("Girafa1", "22/03/2000", 100, false, "Frutas", 1);
		Animal girafa2 = new Girafa("Girafa2", "10/09/2014", 85, false, "Frutas", 1);
		
		Animal tigre1 = new Tigre("Tigre1", "10/03/2011", 180, false, "Carne", "Branco");
		Animal tigre2 = new Tigre("Tigre2", "26/03/2001", 200, false, "Carne", "Listrado");
		
		AnimalDAO animais = new AnimalDAO();
		animais.addAnimal(elefante1);
		animais.addAnimal(elefante2);
		animais.addAnimal(girafa1);
		animais.addAnimal(girafa2);
		animais.addAnimal(tigre1);
		animais.addAnimal(tigre2);
		
		animais.listaAnimais();
		System.out.println("Total de alimentacao de herbivoros: " + animais.alimentacaoHerbivoros());
		System.out.println("Total de alimentacao de carnnivoros: " + animais.alimentacaoCarnivoros());
	}
}
