package DevDojo_Maratona;

public class A34_Arrays_03 {
    static void main() {
        // byte, short, int, long, float, double tem valores padrões = 0
        //char '\u0000' ' '
        //boolena false
        //string null

        String[] nomes = new String[3];
        nomes[0] = "joao";
        nomes[1] = "fatima";
        nomes[2] = "rogerio";

         for (int i = 0; i < nomes.length; i ++){
             System.out.println(nomes[i]);
         }
    }
}
