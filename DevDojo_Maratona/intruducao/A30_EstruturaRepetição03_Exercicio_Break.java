package DevDojo_Maratona;

public class A30_EstruturaRepetição03_Exercicio_Break {
    public static void main(String[] args){
    double valorTotal = 30000;
    for(int parcela = 1; parcela <= valorTotal; parcela++){
        double valorParcela = valorTotal / parcela;
        if (valorParcela < 1000){
            break;
        }
        System.out.println("parcela"+ parcela + "R$" +valorParcela);

        System.out.println("fora do if, mas dentro do for "+ parcela);
        }
    }
}
