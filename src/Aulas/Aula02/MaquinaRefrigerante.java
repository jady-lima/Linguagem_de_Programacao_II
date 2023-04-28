package Aulas.Aula02;

public class MaquinaRefrigerante
{
    //ATRIBUTOS 
    private int preco;
    private int balanco;
    private int total;

    //METODO CONSTRUTOR DA CLASSE
    public MaquinaRefrigerante (int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
    }

    //METODO DE RETORNO DO PRECO (get)
    public int getPreco()
    {
        return preco;
    }

    //METODO DE EDIÇÃO DO PRECO
    public void setPreco(int p)
    {
        preco = p;
    }

    //METODO DE RETORNO DE BALANÇO
    public int getBalanco()
    {
        return balanco;
    }

    //MÉTODO DE EDIÇÃO DO BALANÇO
    public void setBalanco(int b)
    {
        balanco = b;
    }

    //MÉTODO DE RETORNO DO TOTAL
    public int getTotal()
    {
        return total;
    }

    //MÉTODO DE EDIÇÃO DO TOTAL
    public void setTotal(int t)
    {
        total = t;
    }

    //MÉTODO QUE RECEBE UM VALOR EM DINHEIRO
    public void inserirDinheiro(int valor)
    {
        balanco += valor;
    }

    //IMPRIME O PREÇO DO REFRIGERANTE
    public void imprimirPreco()
    {
        System.out.println("####################");
        System.out.println("# PRECO            #");
        System.out.println("# REFRIGERANTE:    #");
        System.out.println("# R$ " + preco + ",00          #");
        System.out.println("####################");
    }
}
