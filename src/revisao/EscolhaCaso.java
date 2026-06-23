package revisao;

import java.util.Scanner;

public class EscolhaCaso {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("""
                 [1] SOMAR
                 [2] SUBTRAIR
                 [3] MULTIPLICAR
                 [4] DIVIDIR
                 [5] POTÊNCIA
                 [6] RAIZ QUADRADA
                 [7] RESTO DA DIVISÃO
                 [0] SAIR
               \s""");
        System.out.print("Opção: ");
        int opcao = leia.nextInt();
        System.out.print("Digite o primeiro número: ");
        double numero1 = leia.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = leia.nextDouble();
        double resultado = 0 ;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            case 5:
                resultado = Math.pow(numero1, numero2);
                break;
            case 6:
                resultado = Math.sqrt(numero1) + Math.sqrt(numero2);
                break;
            case 7:
                resultado = numero1 % numero2;
                break;
            case 0:
                break;
            default:
                System.out.println("Opção Inválida");
        }
        System.out.printf("O resultado é igual a %.2f ", resultado);

    }
}


