import java.util.ArrayList;

public class Repositorio 
{
    //Array de veiculos
    private ArrayList<Veiculos> veiculos;

    //Construtor
    public Repositorio()
    {
        veiculos = new ArrayList<Veiculos>();
    }

    //Método que adiciona um novo veiculo
    public void addVeiculo(Veiculos v)
    {
        veiculos.add(v);
    }

    //Função que lista o tamanho do veiculo
    public int sizeVeiculos()
    {
        return veiculos.size();
    }

    //Lista os carros cadastrados
    public void listVeiculos()
    {
        System.out.println("--------- Veiculos Cadastrados ---------");
        for (Veiculos veiculo: veiculos)
        {
            System.out.println("Veiculo: " + veiculo.getMarca() + " ; " + veiculo.getPlaca() + " ; " + veiculo.getQuilometragem() + "km ; R$" + veiculo.getValorAluguel());
        }
    }

    //Alugar veiculo
    public void alugarVeiculo(int indiceVeiculo)
    {
        if (indiceVeiculo < 0)
        {
            System.out.println("Entrada inválida");
        }
        else if (indiceVeiculo < sizeVeiculos())
        {
            veiculos.get(indiceVeiculo).setAlugado();
        }
    }

    //Lista veiculos alugados
    public void veiculosAlugados()
    {
        System.out.println("---------- Alugados ---------");
        for (Veiculos veiculo: veiculos)
        {
            if(veiculo.getAlugado())
            {
                System.out.println("Placa do veiculo: " + veiculo.getPlaca() + "Valor: R$ " + veiculo.getValorAluguel());
            }
        }
    }

    //Lista veiculos disponiveis
    public void veiculosDisponiveis()
    {
        System.out.println("---------- Disponiveis ---------");
        for (Veiculos veiculo: veiculos)
        {
            if(veiculo.getAlugado())
            {
                System.out.println("Placa do veiculo: " + veiculo.getPlaca() + " Valor: R$ " + veiculo.getValorAluguel());
            }
        }
        System.out.println("Veiculo mais caro: " + veiculos.get(veiculoMaiorPreco()).getPlaca() + " Valor: R$" + veiculos.get(veiculoMaiorPreco()).getValorAluguel());
        System.out.println("Veiculo com menor aluguel: " + veiculos.get(veiculoMenorPreco()).getPlaca() + " Valor: R$" + veiculos.get(veiculoMenorPreco()).getValorAluguel());
    }

    //Lista carro com maior preço
    public int veiculoMaiorPreco()
    {
        //variaveis auxiliares
        int indice = 0;
        Veiculos veiculoAuxiliar = new Veiculos();

        for (int i = 0; i<sizeVeiculos(); i++)
        {
            if(veiculos.get(i).getValorAluguel() > veiculoAuxiliar.getValorAluguel())
            {
                veiculoAuxiliar.setPlaca(veiculos.get(i).getPlaca());
                veiculoAuxiliar.setValorAluguel(veiculos.get(i).getValorAluguel());
                veiculoAuxiliar.setQuilometragem(veiculos.get(i).getQuilometragem());
                indice = i;
            }
        }
        return indice;
    }

    //Lista carro com menor preço
    public int veiculoMenorPreco()
    {
        //variaveis auxiliares
        int indice = 0;
        Veiculos veiculoAuxiliar = new Veiculos();
        veiculoAuxiliar.setPlaca(veiculos.get(0).getPlaca());
        veiculoAuxiliar.setValorAluguel(veiculos.get(0).getValorAluguel());
        veiculoAuxiliar.setQuilometragem(veiculos.get(0).getQuilometragem());

        for (int i = 0; i<sizeVeiculos(); i++)
        {
            if(veiculos.get(i).getValorAluguel() < veiculoAuxiliar.getValorAluguel())
            {
                veiculoAuxiliar.setPlaca(veiculos.get(i).getPlaca());
                veiculoAuxiliar.setValorAluguel(veiculos.get(i).getValorAluguel());
                veiculoAuxiliar.setQuilometragem(veiculos.get(i).getQuilometragem());
                indice = i;
            }
        }
        return indice;
    }

}
