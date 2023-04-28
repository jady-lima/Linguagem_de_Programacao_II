package Provas.U1_Prova1;

public class Motos extends Veiculos
{
    //Atributos
    private String tipoPartida;
    private int cilindradas;

    //Construtor
    public Motos()
    {

    }

    //Função de acesso do tipo de partida
    public String getTipoPartida()
    {
        return tipoPartida;
    }
    
    //Função de edição do tipo de partida
    public void setTipoPartida(String t)
    {
        if (t.equals("manual") || t.equals("eletrica"))
        {
            this.tipoPartida = t;
        }
        else
        {
            System.out.println("Tipo de partida não aceito");
        }
    }

    //Função de acesso as cilindradas
    public int getCilindradas()
    {
        return cilindradas;
    }

    public void setCilindradas(int c)
    {
        this.cilindradas = c;
    }
}

//cm^3 de cilindradas int