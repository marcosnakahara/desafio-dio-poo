import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso Java");
        cursoJava.setDescricao("descrição curso Java");
        cursoJava.setCargaHoraria(8);
        System.out.println(cursoJava);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("curso Js");
        cursoJs.setDescricao("descrição curso Js");
        cursoJs.setCargaHoraria(8);
        System.out.println(cursoJs);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
