package DevDojo_Maratona.javacore.Aintroducaoclasses.teste;

import DevDojo_Maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.ano = 2005;
        carro.nome = "corsa";
        carro.modelo = "sedã";

        carro2.ano = 2003;
        carro2.nome = "celta";
        carro2.modelo = "hatch";

        System.out.println("ano: " + carro.ano + "\nnome: " + carro.nome + "\nmodelo: " + carro.modelo);
        System.out.println("ano: " + carro2.ano + "\nnome: " + carro2.nome + "\nmodelo: " + carro2.modelo);

    }
}
