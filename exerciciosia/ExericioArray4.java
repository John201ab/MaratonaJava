package exerciciosia;
import java.util.Scanner;
public class ExericioArray4 {
    static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("digite numeros para saber qual é o maior: ");
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("o maior numero é: "+ maior + " e o menor numero é: "+ menor );
    }
}
