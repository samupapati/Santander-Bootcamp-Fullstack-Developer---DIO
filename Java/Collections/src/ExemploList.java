import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(5d);
        notas.add(6.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("");
        System.out.println("Adicione na lista a nota 8 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Substitua a nota 5 pela nota 6");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Confira se a nota 5 está na lista:");
        System.out.println(notas.contains(5d));

        System.out.println("");
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        notas.forEach(nota -> {
            System.out.println(nota);
        });

        System.out.println("");
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(3));

        System.out.println("");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("");
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iteratorSoma = notas.iterator();
        Double soma = 0d;
        while(iteratorSoma.hasNext()){
            Double next = iteratorSoma.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("");
        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("");
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Remova a nota da posicao 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("");
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iteratorMenor7 = notas.iterator();
        while(iteratorMenor7.hasNext()){
            Double next = iteratorMenor7.next();
            if(next < 7){
                iteratorMenor7.remove();
            }
        }
        System.out.println(notas);

        System.out.println("");
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("");
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        //Exercícios

        System.out.println("");
        System.out.println("Crie uma lista chamada notas2");
        System.out.println("e coloque todos os elementos do list Arraylist nessa nova lista");

        System.out.println("");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo");

        System.out.println("");
        System.out.println("Mostre a primeira nota da nova lista removendo-o");
    }
}
