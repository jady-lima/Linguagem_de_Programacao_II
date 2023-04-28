package Aulas.Aula04.MetodoGenericos;

public class MetodoGenerico 
{
    //Arrays de diversos tipos
    Double [] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    Integer [] arrayInt = {1, 2, 3, 4, 5, 6};
    Character [] arrayChar = {'O', 'L', 'A', '!'};

    //Método generico
    public <T> void imprimirVetor(T v[])
    {
        for (T o : v) 
        {
            System.out.println(o + " ");
        }
        System.out.println();
    }
}
