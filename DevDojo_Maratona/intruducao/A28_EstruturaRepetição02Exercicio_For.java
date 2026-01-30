package DevDojo_Maratona;

public class A28_EstruturaRepetição02Exercicio_For {
    public static void main(String[] args){
        for (int cont = 0; cont <= 100; ){
            if(cont % 2 == 0){
                System.out.println(cont);
                cont += 1;
            }
            else if (cont % 1 == 0) {
                cont +=1;
            }


        }

    }
}
