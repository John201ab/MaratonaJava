package DevDojo_Maratona.javacore.Bintroducaometodos.test;

import DevDojo_Maratona.javacore.Bintroducaometodos.dominio.A44_Calculadora;

public class A52_calculadoratest {
    public static void main(String[] args) {
        A44_Calculadora soma = new A44_Calculadora();
        int[] numeros = {1,2,9,4,5};
        soma.somafor(numeros);
        soma.somaVargs(1,2,3,4,5,6,7,8,9);


    }
}
