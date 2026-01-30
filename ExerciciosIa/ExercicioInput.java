package Execicios;
import javax.xml.transform.Source;
import java.util.Scanner;
public class ExercicioInput {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("digite sua altura");
        String altura = sc.nextLine();
        float altura2 = Float.parseFloat(altura);

        System.out.println( nome + "\n" + idade + "\n" + altura2);

    }

}
