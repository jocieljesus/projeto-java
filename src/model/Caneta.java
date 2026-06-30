package model;

public class Caneta {
    private String cor;
    public static final double PONTA = 0.7;
    private boolean tampada;
    private boolean carga;
    private String material;


    public Caneta() {
    }

    public Caneta(String cor,boolean tampada, boolean carga, String material) {
        this.cor = cor;
        this.tampada = tampada;
        this.carga = carga;
        this.material = material;
    }

    public Caneta(String cor, double ponta) {
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
