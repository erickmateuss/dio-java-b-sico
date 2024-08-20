package com.digitalinnovation;

import java.util.*;



   /*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
  public class AtividadeProposta01 {

       public static void main(String[] args) {
           System.out.println("Criando um conjunto de cores do Arco-íris! ");
           Set<String> coresArcoiris = new HashSet<>();
           coresArcoiris.add("violeta");
           coresArcoiris.add("anil");
           coresArcoiris.add("azul");
           coresArcoiris.add("verde");
           coresArcoiris.add("amarelo");
           coresArcoiris.add("laranja");
           coresArcoiris.add("vermelho");

           System.out.println("Exiba todas as cores do arco-íris uma abaixo da outra: ");
           for (String cor : coresArcoiris){
               System.out.println(cor);
           }

           System.out.println("A quantidade de cores no Arco-íris: ");
           System.out.println("Tem " + coresArcoiris.size()+ " no arco-íris.");

           System.out.println("Exiba as cores em ordem alfabética: ");
           Set<String> coresArcoiris2 = new TreeSet<>(coresArcoiris);
           System.out.println(coresArcoiris2);

           System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
            Set<String> coresArcoiris3 = new LinkedHashSet<>(
                    Arrays.asList("violeta","anil","azul","verde","amarelo","laranja","vermelho"));
           System.out.println("Ordem Informada " + coresArcoiris3);
           List<String> coresArcoirisList = new ArrayList<>(coresArcoiris3);
           Collections.reverse(coresArcoirisList);
           System.out.println("Ordem Reversa " + coresArcoirisList);

           System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
           for (String cor : coresArcoiris) {
               if (cor.startsWith("v")) System.out.println(cor);
           }
           System.out.println("Remova todas as cores que não começam com a letra “v”: ");
           Iterator<String> iterator2 = coresArcoiris.iterator();
           while (iterator2.hasNext()){
               if (!iterator2.next().startsWith("v")) iterator2.remove();
           }
           System.out.println(coresArcoiris);

           System.out.println("Limpe o conjunto: ");
           coresArcoiris.clear();

           System.out.println(coresArcoiris);


           System.out.println("Confira se o conjunto está vazio: " + coresArcoiris.isEmpty());



       }
}
