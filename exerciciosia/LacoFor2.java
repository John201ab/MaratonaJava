package exerciciosia;
import java.util.Scanner;
public class LacoFor2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um numero para ser somado: ");
       int num = sc.nextInt();
       int resultado = 0;
       sc.nextLine();
       for (int i = 1; i < num + 1; i ++){
           System.out.println(i);
           resultado += i;
       }
       System.out.println("o resultado é: " + resultado);


    }

}
