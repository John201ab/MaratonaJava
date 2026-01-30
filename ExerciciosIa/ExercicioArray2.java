package ExerciciosIa;
import java.util.Scanner;
public class ExercicioArray2 {
    static void main(String[] args) {
        int[] numeros = new int[5];
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("digite um numero: ");
                numeros[i] = sc.nextInt();
                soma += numeros[i];
        }
        System.out.println("===somando===");
        for( int i = 0; i < numeros.length; i++){
            System.out.println("somando " + i + "...");
        }
        System.out.println(soma);
    }
}
