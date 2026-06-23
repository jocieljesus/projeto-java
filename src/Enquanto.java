import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String continuar;
        do{
            System.out.println("Ola mundo!");
            System.out.print("Quer continuar: ");
            continuar = leia.nextLine();
        }while (
                continuar.equalsIgnoreCase("s"));
    }

}

