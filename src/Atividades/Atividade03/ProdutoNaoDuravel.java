package Atividades.Atividade03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoNaoDuravel extends Produto
{
    //Atributos
    private Date date;
    private String genero;

    //construtor
    public ProdutoNaoDuravel()
    {

    }

    public void setDate(String data)
    {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        date = null;
        try 
        {
            date = formato.parse(data);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }


    //Método de acesso da validade
    public Date getDate()
    {
        return date;
    }

    //Método de acesso do genero
    public String getGenero()
    {
        return genero;
    }

    //Método de edição do genero
    public void setGenero(String g)
    {
        genero = g;
    }
}