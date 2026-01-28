package exerciciosia;
import java.util.Scanner;
public class ExercicioArray3{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas = 0;

        for( int i = 0; i < 4; i++){
            System.out.println("digite sua nota: ");
            notas += sc.nextInt();
            sc.nextLine();
        }
        System.out.println(" Sua média é: ");
        System.out.println(notas / 4);
    }
}
