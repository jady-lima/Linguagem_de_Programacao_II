package Atividades.Atividade01;

public class Pessoa
{
    //Atributos 
    private double peso;
    private double altura;

    //Retorna o peso da pessoa
    public double getPeso()
    {
        return peso;
    }

    //Edita o peso da pessoa
    public void setPeso(double p)
    {
        peso = p;
    }

    //Retorna a altura da pessoa
    public double getAltura()
    {
        return altura;    
    }
    
    //Edita a altura da pessoa
    public void setAltura(double a)
    {
        altura = a;
    }

    //Metodo que calcula o IMC
    public double calcularIMC()
    {
        // peso / altura * altura
        return peso / (altura * altura);
    }

    //Recebe o valor do IMC e retorna a mensagem de acordo com o tipo de IMC
    public String informarIMC(double imc)
    {
        String msg;

        if(imc < 18.5)
        {
            msg = "Abaixo do peso.";
        }
        else if (imc >= 18.5 && imc <= 24.9)
        {
            msg = "Peso normal.";
        }
        else if (imc >= 25.0 && imc <= 29.9)
        {
            msg = "Pré-obesidade.";
        }
        else if (imc >= 30.0 && imc <= 34.5)
        {   
            msg = "Obesidade Grau 1.";
        }
        else if (imc >= 35.0 && imc <= 39.9)
        {  
            msg = "Obesidade Grau 2.";
        }
        else
        {
            msg = "Obesidade Grau 3.";       
        }
        return msg;
    }
}
