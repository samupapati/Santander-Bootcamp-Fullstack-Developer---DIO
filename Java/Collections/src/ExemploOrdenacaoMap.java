/*Dadas as seguintes informações sobre livros e seus autores, crie um dicionário e ordene exibindo:
*   Nome: Autor - Nome: Livro - Páginas: numero de páginas
*
*   Autor = Hawkin, Stephen - Livro = Uma breve história do tempo - paginas = 256
*   Autor = Duhigg, Charles - O Poder do Hábito - paginas = 408
*   Autor = Harari, Yuval Noah - 21 Lições para o século 21 - paginas = 432
* */

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Ordem Aleatória");
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("");
        System.out.println("Ordem de inserção");
        Map<String, Livro> livros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : livros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("");
        System.out.println("Ordem alfabética autores");
        Map<String, Livro> livros3 = new TreeMap<>(livros2);
        for(Map.Entry<String, Livro> livro : livros3.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("");
        System.out.println("Ordem alfabética nome dos livros");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNome());
        livros4.addAll(livros.entrySet());
        for(Map.Entry<String, Livro> livro : livros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("");
        System.out.println("Ordem número de página");
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

