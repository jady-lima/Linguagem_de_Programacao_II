public class Prova {
    //ATRIBUTOS
    private double notaParte1;
    private double notaParte2;

    //CONSTRUTOR DA CLASSE
    public Prova(double parte1, double parte2)
    {
        setNotaParte1(parte1);
        setNotaParte2(parte2);
    }

    //MÉTODO QUE CALCULA A NOTA TOTAL DA PROVA
    public double calcularNotaTotal()
    {
        double notaTotal = getNotaParte1() + getNotaParte2();
        if(notaTotal >= 10)
        {
            return 10.0;
        }
        return notaTotal;
    }

    //MÉTODO DE ACESSO DA PARTE1 DA NOTA
    public double getNotaParte1()
    {
        return notaParte1;
    }

    //MÉTODO DE EDIÇÃO DO PARTE1 DA NOTA
    public void setNotaParte1(double parte1)
    {
        notaParte1 = parte1;
    }

    //MÉTODO DE ACESSO DA PARTE2 DA NOTA
    public double getNotaParte2()
    {
        return notaParte2;
    }

    //MÉTODO DE EDIÇÃO DO PARTE2 DA NOTA
    public void setNotaParte2(double parte2)
    {
        notaParte2 = parte2;
    }
}
