package DevDojo_Maratona;

public class A38_ArraysMultidimensionais03_Inicializacao {
    static void main(String[] args) {
        int[][] numeros = {{1,2},{3,4,5,6},{7,8,9}};

        for( int[] base : numeros){
            System.out.println("\n=-=-=-=-=-=-=-=-=");
            for( int num : base){
                System.out.print(num + " ");
            }
        }
    }
}
