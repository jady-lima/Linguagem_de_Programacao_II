public class MaquinaRefrigeranteView 
{
    public static void main (String arg[]) 
    {
        //INSTANCIANDO A CLASSE
        MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);

        //CHAMANDO O METODO DE IMPRESSÃO
        maquina.imprimirPreco();

        //INSERIR DINHEIRO NA MAQUINA
        System.out.println("");
        maquina.inserirDinheiro(20);

        //RETORNANDO O BALANÇO CORRENTE
        System.out.println("");
        System.out.println("Balanco atual => " + maquina.getBalanco());
    }
}
