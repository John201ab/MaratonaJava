package exerciciosia;
import java.util.Scanner;
public class LacoFor3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas notas deseja adicionar?");
        float loop = sc.nextInt();
        sc.nextLine();
        float bau = 0;

        for(float i = 1; i < loop+1; i++){
            System.out.println("Digite a " + i + "º nota: ");
            float notas = sc.nextFloat();
            sc.nextLine();
            bau += notas;

        }
        float resultado = bau / loop;

        System.out.println("a média das notas é: "+ resultado);
    }
}
