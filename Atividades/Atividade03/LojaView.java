public class LojaView
{
    public static void main(String[] args) 
    {
        //Objeto do tipo deposito
        Deposito deposito = new Deposito();

        //Objetos do tipo produtoDuravel
        ProdutoDuravel produtoDuravel1 = new ProdutoDuravel();
        produtoDuravel1.setNome("Carro");
        produtoDuravel1.setPreco(130000);
        produtoDuravel1.setMarca("Hyundai");
        produtoDuravel1.setDescricao("Carro esportivo");
        produtoDuravel1.setDurabilidade(50);
        deposito.addProduto(produtoDuravel1);

        ProdutoDuravel produtoDuravel2 = new ProdutoDuravel();
        produtoDuravel2.setNome("Livro");
        produtoDuravel2.setPreco(29.90);
        produtoDuravel2.setMarca("Saraiva");
        produtoDuravel2.setDescricao("Livro novo");
        produtoDuravel2.setDurabilidade(15);
        deposito.addProduto(produtoDuravel2);

        ProdutoDuravel produtoDuravel3 = new ProdutoDuravel();
        produtoDuravel3.setNome("Celular");
        produtoDuravel3.setPreco(1200);
        produtoDuravel3.setMarca("Samsung");
        produtoDuravel3.setDescricao("S23");
        produtoDuravel3.setDurabilidade(8);
        deposito.addProduto(produtoDuravel3);

        //Objetod do tipo produtoNaoDuravel;
        ProdutoNaoDuravel produtoNaoDuravel1 = new ProdutoNaoDuravel();
        produtoNaoDuravel1.setNome("Chocolate");
        produtoNaoDuravel1.setPreco(29.90);
        produtoNaoDuravel1.setMarca("Lacta");
        produtoNaoDuravel1.setDescricao("Meio Amargo");
        produtoNaoDuravel1.setDate("2023");
        produtoNaoDuravel1.setGenero("Alimento");
        deposito.addProduto(produtoNaoDuravel1);

        ProdutoNaoDuravel produtoNaoDuravel2 = new ProdutoNaoDuravel();
        produtoNaoDuravel2.setNome("Leite");
        produtoNaoDuravel2.setPreco(9.90);
        produtoNaoDuravel2.setMarca("Clan");
        produtoNaoDuravel2.setDescricao("Desnatado");
        produtoNaoDuravel2.setDate("2023");
        produtoNaoDuravel2.setGenero("Alimento");
        deposito.addProduto(produtoNaoDuravel2);

        ProdutoNaoDuravel produtoNaoDuravel3 = new ProdutoNaoDuravel();
        produtoNaoDuravel2.setNome("Arroz");
        produtoNaoDuravel2.setPreco(5.90);
        produtoNaoDuravel2.setMarca("Clan");
        produtoNaoDuravel2.setDescricao("Integral");
        produtoNaoDuravel2.setDate("2024");
        produtoNaoDuravel2.setGenero("Alimento");
        deposito.addProduto(produtoNaoDuravel3);

        System.out.println("Quantidade de produtos no estoque: " + deposito.produtoEmEstoque());
        deposito.removeProduto(3);
        System.out.println("Quantidade de produtos no estoque: " + deposito.produtoEmEstoque());
        deposito.EstoqueVazio();
        System.out.println("O produto com maior valor tem o indice: " + deposito.produtoMaiorPreco());
    }
}