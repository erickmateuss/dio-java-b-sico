package com.digitalinnovation;

import java.sql.SQLOutput;
import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class AtividadeProposta {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os estaodos e suas respectivas populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
        put("PE", 9616621);
        put("AL", 351543);
        put("CE", 9187103);
        put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("Substitua a população do estado RN por 3.534.165: ");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione " +
                "PB 4.039.277 ");
        populacaoEstadosNE.put("PB",4039277);
        System.out.println(populacaoEstadosNE);

        System.out.println("Exiba a população PE: " + populacaoEstadosNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informada: ");
        Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB",4039277);
        }};
        System.out.println(populacaoEstadosNE2);

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE2);
        System.out.println(populacaoEstadosNE3);


        Collection<Integer> populacao = populacaoEstadosNE2.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE2.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com a menor população (%s) e seu respectivo valor (%d)\n", estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n", estadoMaiorPopulacao, Collections.max(populacao));



        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE2.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma /populacaoEstadosNE2.size()));

        System.out.println("Remova os estados com a população manor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNE2.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE2);

        populacaoEstadosNE2.clear();
        System.out.println("Apague o dicionário de estados com suas respctivas populações estimadas: " + populacaoEstadosNE2);


        System.out.println("Confira se a lista está vazia " + populacaoEstadosNE2.isEmpty());






    }

}
