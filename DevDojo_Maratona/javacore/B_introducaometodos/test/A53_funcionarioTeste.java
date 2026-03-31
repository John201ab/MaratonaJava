package DevDojo_Maratona.javacore.B_introducaometodos.test;

import DevDojo_Maratona.javacore.B_introducaometodos.dominio.A53_funcionario;

public class A53_funcionarioTeste {
    public void main(String[] args) {
        A53_funcionario funcionario = new A53_funcionario();

        funcionario.nome = "João";
        funcionario.idade = 21;
        funcionario.salario = new double[] {10.000, 15.500, 9.800};

        funcionario.imprme();
    }

}