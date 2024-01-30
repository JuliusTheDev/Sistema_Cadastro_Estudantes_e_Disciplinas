package exUm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao = 6;
        while (opcao != 0) {
            System.out.println("1- Cadastrar Estudante");
            System.out.println("2 – Imprimir Estudantes");
            System.out.println("3 – Quantidade de estudantes");
            System.out.println("4 – Média geral da disciplina");
            System.out.println("5 – Remover um estudante a partir do nome");
            System.out.println("0 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do estudante: ");
                    String nomeEstudante = scanner.next();
                    System.out.print("Renda do estudante: ");
                    double renda = scanner.nextDouble();
                    System.out.print("Média do estudante: ");
                    double media = scanner.nextDouble();

                    estudantes.add(new Estudante(nomeEstudante, renda, media));
                    break;
                case 2:
                    for (Estudante estudante : estudantes) {
                        System.out.println(estudante);
                    }
                    break;
                case 3:
                    System.out.println("Quantidade de estudantes: " + estudantes.size());
                    break;
                case 4:
                    double mediaGeral = 0;
                    for (Estudante estudante : estudantes) {
                        mediaGeral += estudante.getMedia();
                    }
                    System.out.println("Média geral da disciplina: " + mediaGeral / estudantes.size());
                    break;
                case 5:
                    System.out.print("Nome do estudante a ser removido: ");
                    String nomeEstudanteRemover = scanner.next();

                    for (int i = 0; i < estudantes.size(); i++) {
                        if (estudantes.get(i).getNomeEstudante().equals(nomeEstudanteRemover)) {
                            estudantes.remove(i);
                            break;
                        }
                    }
                case 0:
                    System.out.println("Programa encerrado");
                    break;

            }
        }
        scanner.close();
    }

}