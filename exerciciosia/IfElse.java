package exerciciosia;

import java.util.Scanner;
public class IfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names do you want to write?  ");
        int loop;
        loop = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[loop];


        for(int i = 0; i < loop; i++) {
            System.out.println("write any name: ");
            nomes[i] = sc.nextLine();
        }

        boolean validade = false;
        while (validade = false)
            System.out.println("now, search a name: ");

    }
}
