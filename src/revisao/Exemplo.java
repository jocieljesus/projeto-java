package revisao;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
/*
        Comentários de mais de uma linha
        String nome;
        int idade;
*/
        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite sua idade: ");
        int idade =  Integer.parseInt(leia.nextLine()); // Convertendo de string para inteiro.

        System.out.println("Esse é o "+nome+" e ele tem "+idade+" anos");
        System.out.printf("Esse é o %s e ele %d anos", nome, idade);

    }
}