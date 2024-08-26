import br.com.dio.desafio.dominion.Bootcamp;
import br.com.dio.desafio.dominion.Curso;

import br.com.dio.desafio.dominion.Dev;
import br.com.dio.desafio.dominion.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(30);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descriição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devErick = new Dev();
        devErick.setNome("Erick");
        devErick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Erick" + devErick.getConteudosInscritos());

        devErick.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Inscritos Erick" + devErick.getConteudosInscritos());

        System.out.println("Conteúdos Concluidos Erick" + devErick.getConteudosConcluidos());

        System.out.println("Xp: " + devErick.calcularTotalXp());

        System.out.println("-------------------");

        Dev devTalita = new Dev();
        devTalita.setNome("Talita");
        devTalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Talita" + devTalita.getConteudosInscritos());

        devTalita.progredir();
        devTalita.progredir();
        devTalita.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Inscritos Talita" + devTalita.getConteudosInscritos());

        System.out.println("Conteúdos Concluidos Talita" + devTalita.getConteudosConcluidos());
        System.out.println("Xp: " + devTalita.calcularTotalXp());
    }
}
