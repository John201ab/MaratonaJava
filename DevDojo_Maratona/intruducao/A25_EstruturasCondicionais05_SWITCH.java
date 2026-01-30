package DevDojo_Maratona;

public class A25_EstruturasCondicionais05_SWITCH {
    public static void main(){
        // ultilizando switch, dados os valores de 1 a 7, iprima se é dia util ou final de semana
        //considerando 1 como domingo

        byte dia = 10;
        switch (dia){
            case 1:
            case 7:
                System.out.println("final de semana");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;

            default:
                System.out.println("opção inválida");
                break;
        }
    }
}
