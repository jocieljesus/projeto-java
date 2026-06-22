/*
 O Cálculo do IMC com Diagnóstico Completo**
Desenvolva um programa que calcule o Índice de Massa Corporal
(IMC) de uma pessoa.  O script deve pedir o peso (em kg) e a altura (em metros).
 O cálculo é feito pela fórmula: $IMC = \frac{peso}{altura^2}$.
 Após calcular o valor do IMC, utilize uma estrutura encadeada
 de `if/elif/else` para exibir o diagnóstico exato:

- Abaixo de 18.5: **Abaixo do peso**
- Entre 18.5 e 24.9: **Peso ideal (parabéns)**
- Entre 25.0 e 29.9: **Levemente acima do peso**
- Entre 30.0 e 34.9: **Obesidade Grau I**
- Acima de 35.0: **Obesidade Severa/Mórbida**
 */
import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //leia.useLocale(Locale.US);

        System.out.println("Digite uma altura em metros: ");
        double altura = leia.nextDouble();

        System.out.println("Digite um peso: ");
        double peso = leia.nextDouble();

        System.out.printf("O peso é = %.2f e a altura é = %.2f ", peso, altura);

        double imc = peso / Math.pow(altura, 2); // altura * altura -> potencia

        if (imc < 18.5){
            System.out.println("Abaixo do Peso");
        } else if (imc >= 18.5 & imc < 25){
            System.out.println("**Peso ideal (parabéns)**");
        } else if (imc >= 25 & imc < 30){
            System.out.println("**Levemente acima do peso**");
        } else if (imc >=30 & imc < 35){
            System.out.println("**Obesidade Grau I**");
        } else {
            System.out.println("**Obesidade Severa/Mórbida**");
        }
    }
}
