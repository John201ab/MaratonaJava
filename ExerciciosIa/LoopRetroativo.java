package ExerciciosIa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LoopRetroativo {
    public static void main(String[] args) {
        
        public int recursao = (256);
        public int temp = 0;
        
        while(recursao > 9){
            List<String> lista = Arrays.stream(String.valueOf(recursao).split("")).collect(Collectors.toList());

            temp += lista[0];

            System.out.println(lista);
        }
        
     }    
}
