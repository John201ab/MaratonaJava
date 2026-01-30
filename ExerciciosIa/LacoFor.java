package Execicios;

import java.util.Scanner;
public class LacoFor {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para o loop: ");
        int escolha = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i < escolha+1; i++){
            System.out.println(i);
        }
    }
}
