package DevDojo_Maratona.javacore.Aintroducaoclasses.teste;

import DevDojo_Maratona.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
    static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "carlo";
        professor.materia = "geografia";
        professor.ra = 192;

        System.out.println("nome: " + professor.nome + "\nmatéria: " + professor.materia + "\nRa: " + professor.ra);
    }
}
