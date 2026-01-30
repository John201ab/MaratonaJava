package DevDojo_Maratona;

public class A22_EstruturasCondicionais03_OPERADORTERNARIO {
    public static void main(String[] args){
        double salario = 6000;
        String mensagemDoar = "vou doar dinheiro";
        String mensagemNaoDoar = "vou doar n man";
        String resultado;
        String categoria;

        //(condição) ? verdadeiro : falso

        categoria = salario < 5000 ? mensagemNaoDoar : mensagemDoar;
        System.out.println(categoria);
    }
}
