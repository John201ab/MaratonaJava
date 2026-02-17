package DevDojo_Maratona.javacore.Bintroducaometodos.test;

import DevDojo_Maratona.javacore.Bintroducaometodos.dominio.A44_Calculadora;

public class A44_calculadoraTest {
    static void main(String[] args) {
        A44_Calculadora calculos = new A44_Calculadora();

        calculos.soma();

        System.out.println("-------------");

        calculos.soma2();

        System.out.println("-------------");

        calculos.multiplicacao(10,10);

    }
}
