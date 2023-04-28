package Atividades.Atividade03;

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
        Produto produtoAuxiliar = new Produto();

        for (int i = 0; i<produtoEmEstoque(); i++)
        {
            if(produtos.get(i).getPreco() > produtoAuxiliar.getPreco())
            {
                produtoAuxiliar.setNome(produtos.get(i).getNome());
                produtoAuxiliar.setPreco(produtos.get(i).getPreco());
                produtoAuxiliar.setMarca(produtos.get(i).getMarca());
                produtoAuxiliar.setDescricao(produtos.get(i).getDescricao());
                indice = i;
            }
        }
        return indice;
    }

    //Método para mostrar os produtos
    public void mostraProdutos(int indiceProduto)
    {
        if (indiceProduto < 0)
        {
            System.out.println("Entrada inválida");
        }
        else if (indiceProduto < produtoEmEstoque())
        {
            System.out.println("-------------------------------------");
            System.out.println("             PRODUTO " + (indiceProduto+1) + "             ");
            System.out.println("#####################################");
            System.out.println(" Nome: " + produtos.get(indiceProduto).getNome());
            System.out.println(" Preco: " + produtos.get(indiceProduto).getPreco());
            System.out.println(" Marca: " + produtos.get(indiceProduto).getMarca());
            System.out.println(" Preco: " + produtos.get(indiceProduto).getDescricao());
            System.out.println(" Classe: " + produtos.get(indiceProduto).getClass());
            System.out.println("#####################################");
            System.out.println("");
        }
    }

    //Método de listagem de todos os produtos
    public void listaProdutos()
    {
        for (int i = 0; i <= produtoEmEstoque(); i++)
        {
            mostraProdutos(i);
        }
    }
}