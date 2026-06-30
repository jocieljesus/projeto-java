package model;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String tamanho;

    //Construtor de objeto vazio
    public Produto(){}

    //Contrutor de objeto com parametro
    public Produto(String nome, double preco, int quantidadeEstoque, String tamanho){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tamanho = tamanho;


    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }


    public void setPreco(double p){
        this.preco = p;
    }






    //Métodos
    public void mostrarEstoque(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: "+ this.quantidadeEstoque );
        System.out.println("Tamanho: " + this.tamanho);
    }

    public int adicionarAoEstoque(int quantidade){
        this.quantidadeEstoque += quantidade; //Atualiza valor de estoque
        return this.quantidadeEstoque; //Retorna valor de estoque atualizado
    }

}
