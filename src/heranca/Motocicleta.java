package heranca;

public class Motocicleta extends Transporte{

    private final int LIMITE_VELOCIDADE = 160;

    public Motocicleta(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isLigado) {
        super(nome, marca, modelo, anoFabricacao, preco, isLigado);
    }

    @Override
    public void acelerar() {
        System.out.printf("A velocidade máxima de uma Motocicleta é {} km por hora.", LIMITE_VELOCIDADE);
        super.acelerar();
    }

    public void colocarCapacete(){
        System.out.println("Colocando Capacete");
    }

}
