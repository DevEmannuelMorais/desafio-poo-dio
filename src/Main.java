import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(12);
        curso1.setDescricao("Aprender Programar");
        curso1.setTitulo("Programação");

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Aprendendo JAVA");
        curso2.setCargaHoraria(12);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setData(LocalDate.of(2023,5,10));
        mentoria.setDescricao("Dicas de como programar em JAVA");

    }
}
