package DevDojo_Maratona.javacore.Bintroducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.PanelUI;

public class A53_funcionarioExercicio{

    public String nome = "joão";
    public int idade = 20;
    public double[] salario = {1900, 1300, 5000};

    public void funcionario(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for ( double salarios: salario){
            System.out.println(salarios + " ");
        }
    }
    public void media(){
        double val = 0;
        for( double num : this.salario){
            val += num;
        }
        double result = val / this.salario.length;
        System.out.println(result);
    }
}