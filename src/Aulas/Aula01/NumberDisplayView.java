package Aulas.Aula01;

public class NumberDisplayView{
    public static void main (String arg[])
    {
        NumberDisplay numberDisplay = new NumberDisplay();

        //CHAMA OS MÉTODOS DE MODIFICAR AS VARIAVEIS
        numberDisplay.setLimit(2);
        numberDisplay.setValue(4);

        //IMPRIME OS VALORES NOS METODOS DE ACESSO 
        System.out.println("Limite: " + numberDisplay.getLimit());
        System.out.println("Valor: " + numberDisplay.getValue());
    }
}
