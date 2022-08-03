import java.util.*;

public class ExemploOrdenacaoList {

    /*Dadas as seguintes informações sobre os gatos, crie uma lista e ordene exibindo:
    nome, idade, cor

    gato 1 : nome: Jon, idade: 18, cor: preto;
    gato 2 : nome: Simba, idade: 6, cor: tigrado;
    gato 3 : nome: Jon, idade: 12, cor: amarelo;
    *
    * */
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(gatos);

        System.out.println("");
        System.out.println("Ordem de Inserção");
        System.out.println(gatos);

        System.out.println("");
        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("");
        System.out.println("Ordem Natural (Nome)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("");
        System.out.println("Ordem Idade ");
        //Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("");
        System.out.println("Ordem cor");
        //Collections.sort(gatos, new ComparatorCor());
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("");
        System.out.println("Ordem Nome/Cor/Idade");
        //Collections.sort(gatos, new ComparatorNomeCorIdade());
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0){
            return nome;
        }
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0){
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}