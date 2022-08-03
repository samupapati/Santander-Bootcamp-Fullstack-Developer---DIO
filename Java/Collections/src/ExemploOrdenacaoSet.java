import com.sun.source.tree.Tree;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        /*Dadas as informações sobre séries, crie um conjunto e ordene este conjunto exibindo:
        * nome, genero, tempo do episodio
        *
        * serie 1 = nome: got, genero: fantasia, tempoEpisodio: 60
        * serie 2 = nome: dark, genero: drama, tempoEpisodio: 60
        * serie 3 = nome: that '70s show, genero: comedia, tempoEpisodio: 25*/

        System.out.println("");
        System.out.println("Ordem aleatória");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show","comedia",25));
        }};
        series.forEach(serie -> {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        });

        System.out.println("");
        System.out.println("Ordem de Inserção");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show","comedia",25));
        }};
        series2.forEach(serie -> {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        });

        System.out.println("");
        System.out.println("Ordem Natural (Tempo episodio)");
        Set<Serie> series3 = new TreeSet<>(series2);
        series3.forEach(serie -> {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        });


        System.out.println("");
        System.out.println("Ordem Nome/Genero/TempoEpisodio ");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series4.addAll(series);
        series4.forEach(serie -> {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        });

        System.out.println("");
        System.out.println("Ordem genero");


        System.out.println("");
        System.out.println("Ordem tempo episodio");
        System.out.println();
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0){
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.genero);
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2){
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}