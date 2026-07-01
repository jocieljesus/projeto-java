package heranca;

public class Aviao extends Transporte{

    private final int LIMITE_VELOCIDADE = 460;

    public Aviao(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isLigado) {
        super(nome, marca, modelo, anoFabricacao, preco, isLigado);
    }

    @Override
    public void acelerar() {
        System.out.printf("A velocidade máxima de um Avião é {} km por hora.", LIMITE_VELOCIDADE);
        super.acelerar();
    }

    public void Voar(){
        System.out.println("Voando...");
    }

    public void decolar(){
        System.out.println("Decolando...");
    }

    public void pousar(){
        System.out.println("Pousando...");
    }

}
