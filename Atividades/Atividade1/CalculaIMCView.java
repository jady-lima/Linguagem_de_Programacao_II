public class CalculaIMCView {    
    public static void main (String args[])
    {
        //Instancia o objeto
        Pessoa pessoa = new Pessoa();
        
        //Informa os dados
        pessoa.setPeso(83.5);
        pessoa.setAltura(1.80);

        //Retorna os dados na tela
        System.out.println("Peso => " + pessoa.getPeso());
        System.out.println("Altura => " + pessoa.getAltura());
        System.out.println("IMC => "+ pessoa.calcularIMC());
        System.out.println("Pessoa com "+ pessoa.informarIMC(pessoa.calcularIMC()));
    }
}
