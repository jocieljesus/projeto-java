package heranca;

public class Carro extends Transporte {

    private final int LIMITE_VELOCIDADE = 200;

    public Carro(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isLigado) {
        super(nome, marca, modelo, anoFabricacao, preco, isLigado);
    }


    @Override
    public void acelerar() {
        System.out.printf("A velocidade máxima de um carro é {} km por hora.", LIMITE_VELOCIDADE);
        super.acelerar();
    }
}

