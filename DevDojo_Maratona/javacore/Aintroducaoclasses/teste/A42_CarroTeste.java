package DevDojo_Maratona.javacore.Aintroducaoclasses.teste;

import DevDojo_Maratona.javacore.Aintroducaoclasses.dominio.A42_Carro;

public class A42_CarroTeste {
    static void main(String[] args) {
        A42_Carro a42Carro = new A42_Carro();
        A42_Carro a42Carro2 = new A42_Carro();

        a42Carro.ano = 2005;
        a42Carro.nome = "corsa";
        a42Carro.modelo = "sedã";

        a42Carro2.ano = 2003;
        a42Carro2.nome = "celta";
        a42Carro2.modelo = "hatch";

        System.out.println("ano: " + a42Carro.ano + "\nnome: " + a42Carro.nome + "\nmodelo: " + a42Carro.modelo);
        System.out.println("ano: " + a42Carro2.ano + "\nnome: " + a42Carro2.nome + "\nmodelo: " + a42Carro2.modelo);

    }
}
