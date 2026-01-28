package devDojo_Introducao;

public class A23_EstruturasCondicionais04Exercicio {
    public static void main(String[]  args){
        double salario = 300;
        double desconto1 = salario * 0.0970;
        double desconto2 = salario * 0.3735;
        double desconto3 = salario * 0.4950;
        if(salario < 34712){
            System.out.println("Você terá um desconto de R$" + desconto1 + ", sendo assim, o valor líquido que sobra é: R$" + (salario - desconto1));
        }

        else if(salario >= 34712 || salario <= 68507){
            System.out.println("Você terá um desconto de R$" + desconto2 + ", sendo assim, o valor liquido que sobra é: R$" + (salario - desconto2));
        }

        else{
            System.out.println("Você terá um desconto de R$" + desconto3 + ", sendo assim, o valor liquido que sobra é: R$" + (salario - desconto3));

        }
    }
}
