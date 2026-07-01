import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int [] numeros = { 1, 2, 3, 4, 5 };
        numeros[4] = 6;

        double[] notas = new double[4];
        notas[0] = 8.9;
        notas[1] = 9.2;
        notas[2] = 5.3;
        notas[3] = 7.9;

        String[] nomes = new String[10];
        Integer[] contas = new Integer[8];
        double[] nts = new double[6];
        boolean[] maiores = new boolean[5];


//        Integer.parseInt("1");
//        Double.parseDouble("23");
//        Boolean.toString();


        List<String> listaAlunos = new ArrayList<>();
        listaAlunos.add("Arthur");
        listaAlunos.add("Jaqueline");
        listaAlunos.add("Amanda");
        listaAlunos.add("Luan");


//      listaAlunos.forEach(i -> System.out.println(i));

        listaAlunos.forEach(System.out::println);

        List<Double> listaNotas = new ArrayList<>();
        listaNotas.add(9.5);
        listaNotas.add(9.0);
        listaNotas.add(8.5);
        double soma = 0;
        System.out.println(listaNotas.contains(9.0));


        List<Double> maior9 = listaNotas.stream().filter(x -> x >= 9).toList();
        System.out.println(maior9);

        double totalSoma = listaNotas.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println(totalSoma);

        Double totSoma = 0.0;
        for ( double nota: listaNotas){
            totSoma =+ nota;
        }
        double media = totSoma/listaNotas.size();













    }
}
