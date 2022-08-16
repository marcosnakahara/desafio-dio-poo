import me.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso Java");
        cursoJava.setDescricao("descrição curso Java");
        cursoJava.setCargaHoraria(8);
//        System.out.println(cursoJava);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("curso Js");
        cursoJs.setDescricao("descrição curso Js");
        cursoJs.setCargaHoraria(8);
//        System.out.println(cursoJs);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
//        System.out.println(mentoria);

//        Conteudo conteudo = new Curso();
//        System.out.println(conteudo);
//
//        conteudo = new Mentoria();
//        System.out.println(conteudo);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoria);

        Dev naka = new Dev();
        naka.setNome("Naka");
        naka.inscreverBootcamp(bootcamp);
        System.out.println(naka);
        naka.progredir();
        naka.progredir();
        System.out.println(naka);
        System.out.println("XP: " + naka.calcularTotalXp());

        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcamp);
        System.out.println(joao);
        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println(joao);
        System.out.println("XP: " + joao.calcularTotalXp());
    }
}
