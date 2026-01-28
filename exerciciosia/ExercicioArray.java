package exerciciosia;
import java.util.Scanner;
public class ExercicioArray {
    public static void main(String[] args){
        int[] numero = new int[5];
        Scanner loop = new Scanner(System.in);

        for(int i = 0; i < numero.length; i++){
            System.out.println("Enter a numeber: ");
            numero[i] = loop.nextInt();
            loop.nextLine();
        }
        for(int i = 0; i < numero.length; i ++)
            System.out.println(numero[i]);
    }
}
