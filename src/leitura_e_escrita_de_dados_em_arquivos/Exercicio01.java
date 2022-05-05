package leitura_e_escrita_de_dados_em_arquivos;

/*
Crie uma lista de tarefas e salve a lista em um arquivo
Crie um programa que vai receber, através do console, uma lista de atividades que vai ajudar o usuário a planejar suas
tarefas para o dia seguinte.
Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um arquivo de texto - cada tarefa vai
 ocupar uma linha desse arquivo.
Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console, continue
pedindo que ele informe as atividades.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.print("Jogador " + i + ": ");
            String nome = scanner.nextLine();

            linhas.add(nome);
        }

        Path arquivo = Paths.get("C:\\Users\\Ureal\\Desktop\\Arquivo");
        Files.write(arquivo, linhas);

        scanner.close();
        System.out.println("Fim...");
    }
}