public class ListaTelefonicaView {
    public static void main(String args[])
    {
        //Cria as pessoas
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Harry Potter");
        pessoa1.setEmail("harrypotter@gmail.com");
        String numero1 = "(083) 99473-8737";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Severus Snape");
        pessoa2.setEmail("severus@yahooo.com");
        String numero2 = "(084) 99876-5432";

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("James Potter");
        pessoa3.setEmail("jamespotter@yahoo.com");
        String numero3 = "(092) 99375-8946";

        //Cadastra as pessoas na lista telefonica
        ListaTelefonica lista = new ListaTelefonica();
        lista.inserirContato(numero1, pessoa1);
        lista.inserirContato(numero2, pessoa2);
        lista.inserirContato(numero3, pessoa3);

        //Busca uma pessoa na lista telefonica
        String busca = "(084) 99876-5432";
        lista.buscarContato(busca);
        System.out.println();
        busca = "(084) 99876-0000";
        lista.buscarContato(busca);
    }
}
