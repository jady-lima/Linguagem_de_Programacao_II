package Atividades.Atividade02;

public class Prova {
    //Atributos
    private double notaParte1;
    private double notaParte2;

    //Cosntrutor da classe
    public Prova(double parte1, double parte2)
    {
        setNotaParte1(parte1);
        setNotaParte2(parte2);
    }

    //Método que calcula a nota total da prova
    public double calcularNotaTotal()
    {
        double notaTotal = getNotaParte1() + getNotaParte2();
        if(notaTotal >= 10)
        {
            return 10.0;
        }
        return notaTotal;
    }

    //Método de acesso a parte1 da prova
    public double getNotaParte1()
    {
        return notaParte1;
    }

    //Método de edição a parte1 da prova
    public void setNotaParte1(double parte1)
    {
        notaParte1 = parte1;
    }

    //Método de acesso a parte2 da prova
    public double getNotaParte2()
    {
        return notaParte2;
    }

    //Método de acesso a parte2 da prova
    public void setNotaParte2(double parte2)
    {
        notaParte2 = parte2;
    }
}
