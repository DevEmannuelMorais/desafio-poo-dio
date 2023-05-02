import br.com.dio.desafio.dominio.*;

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


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudoConcluidos());
        devCamila.progredir();
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudoConcluidos());
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoInscritos());
        Dev devManel = new Dev();
        devManel.setNome("Manel");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Manel" + devManel.getConteudoInscritos());






    }
}
