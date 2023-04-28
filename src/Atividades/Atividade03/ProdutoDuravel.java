package Atividades.Atividade03;

public class ProdutoDuravel extends Produto
{
    //Atributos
    private int durabilidade;

    //construtor
    public ProdutoDuravel()
    {

    }

    //método de acesso da durabilidade 
    public int getDurabilidade()
    {
        return durabilidade;
    }

    //método de edição da durabilidade
    public void setDurabilidade(int d)
    {
        durabilidade = d;
    }
}