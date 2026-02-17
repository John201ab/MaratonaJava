package DevDojo_Maratona.javacore.Aintroducaoclasses.teste;

import DevDojo_Maratona.javacore.Aintroducaoclasses.dominio.A41_Professor;

public class A41_ProfessorTeste {
    static void main(String[] args) {
        A41_Professor a41Professor = new A41_Professor();

        a41Professor.nome = "carlo";
        a41Professor.materia = "geografia";
        a41Professor.ra = 192;

        System.out.println("nome: " + a41Professor.nome + "\nmatéria: " + a41Professor.materia + "\nRa: " + a41Professor.ra);
    }
}
