package DevDojo_Maratona.javacore.C_sobrecargametodos.teste;


import DevDojo_Maratona.javacore.C_sobrecargametodos.dominio.Anime01;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime01 anime = new Anime01();
        anime.setNome("Naruto");
        anime.setTipo("Ação");
        anime.setEpisodios(720);
        anime.setTemporadas(12);
        anime.setAutor("sei la man");
        anime.imprime();

    }

}
