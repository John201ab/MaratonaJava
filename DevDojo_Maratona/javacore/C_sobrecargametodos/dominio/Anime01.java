package DevDojo_Maratona.javacore.C_sobrecargametodos.dominio;

public class Anime01 {

    private String nome;
    private String tipo;
    private String autor = "desconehcido";
    private int episodios;
    private int temporadas;


    public void init( String nome, String tipo, int episodios, int temporadas){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.temporadas = temporadas;

    }

    public void init(String nome, String tipo, int episodios, int temporadas, String autor){
        this.init(nome, tipo, episodios, temporadas);
        this.autor = autor;

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.temporadas);
        System.out.println(this.autor);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios (int episodios){
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
