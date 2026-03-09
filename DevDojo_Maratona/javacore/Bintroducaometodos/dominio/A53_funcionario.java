package DevDojo_Maratona.javacore.Bintroducaometodos.dominio;

public class A53_funcionario {
    public String nome = null;
    public int idade = 0;
    public double[] salario = null ;

    public void imprme(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        impsalario();
        media();
    }

    public void impsalario(){
        System.out.print("Os salários são: ");
        for(double salarios : salario){
            System.out.print(salarios + ", ");
        }
    }

    public void media(){
        System.out.println();
        System.out.print("A média salarial é: ");
        double media = 0;
        double mediaf = 0;
        for( double salarios : salario){
            media += salarios;
        }
        mediaf = media / salario.length;

        System.out.println(mediaf);

    }

}
