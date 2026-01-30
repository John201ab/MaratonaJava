package DevDojo_Maratona;

public class A31_EstruturaRepetição04_Continue {
    public static void main(){
    double valorTotal = 30000;
        for(int parcela = (int) valorTotal; parcela >= 1;  parcela--){
        double valorParcela = valorTotal / parcela;
        if (parcela < 1000) {
            continue;
        }
        System.out.println("parcela" + parcela + "R$" + valorParcela);
        }
    }
}
