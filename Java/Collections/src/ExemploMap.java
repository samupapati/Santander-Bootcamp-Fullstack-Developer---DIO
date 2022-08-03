/*Dado os modelos dos carros e seus respectivos consumos na estrada , faça:
*   modelo = gol  - consumo = 14,4km/L
*   modelo = uno  - consumo = 15,6km/L
*   modelo = mobi - consumo = 16,1km/L
*   modelo = hb20 - consumo = 14,5km/L
*   modelo = kwid - consumo = 15,6km/L */

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros);

        System.out.println("");
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("");
        System.out.println("Confira se o modelo tucson está no dicionário: " + carros.containsKey("tucson"));

        System.out.println("");
        System.out.println("Exiba o consumo do uno: " + carros.get("uno"));

//        System.out.println("");
//        System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("");
        System.out.println("Exiba os modelos: ");
        System.out.println(carros.keySet());

        System.out.println("");
        System.out.println("Exiba os consumos dos carros: ");
        System.out.println(carros.values());

        System.out.println("");
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoEconomico = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String economico = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoEconomico))
                economico = entry.getKey();
        }
        System.out.println(economico + " - " + consumoEconomico);

        System.out.println("");
        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoNaoEconomico = Collections.min(carros.values());
        Set<Map.Entry<String, Double>> entries2 = carros.entrySet();
        String naoEconomico = "";
        for(Map.Entry<String, Double> entry: entries2){
            if(entry.getValue().equals(consumoNaoEconomico))
                naoEconomico = entry.getKey();
        }
        System.out.println(naoEconomico + " - " + consumoNaoEconomico);

        System.out.println("");
        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("");
        System.out.println("Exiba a média dos consumos: " + soma / carros.size());

        System.out.println("");
        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");
        Iterator iterator2 = carros.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6)) iterator2.remove();
        }
        System.out.println(carros);

        System.out.println();
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carros2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros2);

        System.out.println();
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carros3 = new TreeMap<>(carros2);
        System.out.println(carros3);

        System.out.println();
        System.out.println("Apague o conjunto de carros: ");
        carros.clear();
        System.out.println(carros);

        System.out.println();
        System.out.println("Confira se a lista está vazia: " + (carros.isEmpty() ? "Sim" : "Não"));
    }
}
