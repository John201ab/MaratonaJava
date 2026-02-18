package DevDojo_Maratona.javacore.Bintroducaometodos.dominio;

public class A53_funcionarioExercicio {

    String nome = "João";
    int idade = 20;
    double[] salarios = {1500.00, 1000.00, 2000.00};


    public void imprima() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            System.out.print("Os salarios são: ");
            for (double num : salarios) {
                System.out.print(num + ", ");
            }
        }
    }

    public void medias() {
        if (salarios == null) {
            return;
        }

        double cont = 0;
        for (double num : this.salarios) {
            cont += num;
        }
        double media = cont / this.salarios.length;

        System.out.println("A média é: " + media);
    }

}
