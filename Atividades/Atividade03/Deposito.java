import java.util.ArrayList;

public class Deposito
{
    //Array de produtos
    private ArrayList<Produto> produtos;

    //Construtor
    public Deposito()
    {
        produtos = new ArrayList<Produto>();
    }

    //Método para adicionar o produto
    public void addProduto(Produto produto)
    {
        produtos.add(produto);
    }

    //Método para remover o produto
    public void removeProduto(int indiceProduto)
    {
        if (indiceProduto < 0)
        {
            System.out.println("Numero invalido");
        }
        else if (indiceProduto < produtoEmEstoque())
        {
            produtos.remove(indiceProduto);
        }
        else
        {
            System.out.println("Numero invalido");
        }
    }

    //Método que informa a quantidade de produtos no deposito
    public int produtoEmEstoque()
    {
        return produtos.size();
    }

    //Método que informa se o deposito está vazio
    public void EstoqueVazio()
    {
        if (produtoEmEstoque() == 0)
        {
            System.out.println("O deposito esta vazio!");
        }
        else
        {
            System.out.println("Ha produtos no estoque!");
        }
    }

    //Método que informa o produto com maior preço
    public int produtoMaiorPreco()
    {
        //variaveis auxiliares
        int indice = 0;
        int i = 0;
        Produto produtoAuxiliar = new Produto();

        for (Produto produto : produtos)
        {
            if(produto.getPreco() > produtoAuxiliar.getPreco())
            {
                indice = i;
            }
            i++;
        }

        return indice;
    }
}