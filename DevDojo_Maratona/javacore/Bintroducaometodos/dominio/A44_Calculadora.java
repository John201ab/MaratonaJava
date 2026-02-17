package DevDojo_Maratona.javacore.Bintroducaometodos.dominio;

public class A44_Calculadora {
    public void soma(){
        System.out.println(10+10);
    }

    public void soma2 (){
        System.out.println(20+20);
    }

    public void multiplicacao(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public void somafor(int[] numeros){
        int acu = 0;
        for (int num : numeros){
            acu += num;
        }
        System.out.println(acu);
    }


    public void somaVargs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
