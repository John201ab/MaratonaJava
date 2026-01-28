package devDojo_Introducao;

public class A19_EstrurasCondicionais_Atribuicao {
    public static void main(String[] args){
        //imprima o dia da semana sendo 1 domingo
        byte dia = 9;
        //char, int, byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("dom");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("tec");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("opção inválida!");


        char sexo = 'h';
        switch (sexo){
                case 'h':
                    System.out.println("Homem");
                    break;

                case 'm':

                    System.out.println("mulher");
            default:
                System.out.println("opção inválida!");
            }
        }

    }
}
