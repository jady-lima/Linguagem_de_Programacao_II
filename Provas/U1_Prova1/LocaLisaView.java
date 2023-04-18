public class LocaLisaView 
{
    public static void main(String[] args) 
    {
        Repositorio repositorio = new Repositorio();

        Veiculos carro1 = new Carros(); 
        ((Carros)carro1).setPlaca("XXX-9999");
        ((Carros)carro1).setPortas(4);
        ((Carros)carro1).setPotenciaMotor(110);
        ((Carros)carro1).setMarca("Fiat");
        ((Carros)carro1).setQuilometragem(150000);
        ((Carros)carro1).setValorAluguel(200.00);
        repositorio.addVeiculo(carro1);    
    
        Veiculos carro2 = new Carros(); 
        ((Carros)carro2).setPlaca("JTP-1098");
        ((Carros)carro2).setPortas(4);
        ((Carros)carro2).setPotenciaMotor(110);
        ((Carros)carro2).setMarca("Hyundai");
        ((Carros)carro2).setQuilometragem(500000);
        ((Carros)carro2).setValorAluguel(350.00);
        repositorio.addVeiculo(carro2);


        Veiculos carro3 = new Carros(); 
        ((Carros)carro3).setPlaca("XPY-9893");
        ((Carros)carro3).setPortas(2);
        ((Carros)carro3).setPotenciaMotor(110);
        ((Carros)carro3).setMarca("Ford");
        ((Carros)carro3).setQuilometragem(0);
        ((Carros)carro3).setValorAluguel(180.00);
        repositorio.addVeiculo(carro3);

        Veiculos moto1 = new Motos(); 
        ((Motos)moto1).setPlaca("LPY-9303");
        ((Motos)moto1).setCilindradas(2500);
        ((Motos)moto1).setTipoPartida("manual");
        ((Motos)moto1).setMarca("Honda");
        ((Motos)moto1).setQuilometragem(0);
        ((Motos)moto1).setValorAluguel(280.00);
        repositorio.addVeiculo(moto1);

        Veiculos moto2 = new Motos(); 
        ((Motos)moto2).setPlaca("PLM-0035");
        ((Motos)moto2).setCilindradas(2500);
        ((Motos)moto2).setTipoPartida("eletrica");
        ((Motos)moto2).setMarca("Hyundai");
        ((Motos)moto2).setQuilometragem(7000);
        ((Motos)moto2).setValorAluguel(300.00);
        repositorio.addVeiculo(moto2);

        Veiculos moto3 = new Motos(); 
        ((Motos)moto3).setPlaca("JTM-0000");
        ((Motos)moto3).setCilindradas(2500);
        ((Motos)moto3).setTipoPartida("eletrica");
        ((Motos)moto3).setMarca("Honda");
        ((Motos)moto3).setQuilometragem(7000);
        ((Motos)moto3).setValorAluguel(300.00);
        repositorio.addVeiculo(moto3);

        repositorio.alugarVeiculo(0);
        repositorio.alugarVeiculo(3);
        repositorio.alugarVeiculo(5);
        repositorio.veiculosAlugados();
        repositorio.veiculosDisponiveis();
        repositorio.listVeiculos();
    }
    
    
}
