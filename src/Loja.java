import model.Produto;

public class Loja {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Tenis Nike", 299.90, 20, "42");
        Produto produto2 = new Produto("Camisa do Brasil", 750.50, 15, "G");

        System.out.println("Estoque do Produto1");
        produto1.mostrarEstoque();

        System.out.println("-".repeat(50));

        produto1.adicionarAoEstoque(5);

        System.out.println("Estoque do Produto1 Atualizado");
        produto1.mostrarEstoque();


    }
}
