package devDojo_Introducao;

public class A27_EstruturaRepetição01_TodosLaços {
    public static void main(String[] args){
        //while,do while, for
        int cont = 5;
        while(cont < 10){
            System.out.println(cont);
            cont += 1;
        }
        do{
            System.out.println("executado");
        }while(cont < 10);

        for (int i = 0 ; i < 10; i++){
            System.out.println("for " + i);
        }
    }
}
