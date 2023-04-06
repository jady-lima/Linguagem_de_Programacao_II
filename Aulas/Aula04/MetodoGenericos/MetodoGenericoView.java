public class MetodoGenericoView {
    public static void main (String[] args)
    {
        MetodoGenerico mg = new MetodoGenerico();

        System.out.println("Vetor com elementos Double: ");
        mg.imprimirVetor(mg.arrayDouble);

        System.out.println("Vetor com elementos Int: ");
        mg.imprimirVetor(mg.arrayInt);

        System.out.println("Vetor com elementos Char: ");
        mg.imprimirVetor(mg.arrayChar);
    }    
}
