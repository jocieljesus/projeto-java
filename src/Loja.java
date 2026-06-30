import model.Caneta;
import model.Produto;

public class Loja {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Tenis Nike", 299.90, 20, "42");

        Produto produto2 = new Produto();
        produto2.setNome("Camisa do Brasil");
        String nome  = produto2.getNome();
        System.out.println(nome);

        produto1.setPreco(700.00);


        produto2.mostrarEstoque();

        System.out.println("Estoque do Produto1");
        produto1.mostrarEstoque();

        System.out.println("-".repeat(50));

        produto1.adicionarAoEstoque(5);

        System.out.println("Estoque do Produto1 Atualizado");
        produto1.mostrarEstoque();



    }
}
