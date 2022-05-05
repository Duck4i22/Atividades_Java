package leitura_e_escrita_de_dados_em_arquivos;

import javax.sound.midi.InvalidMidiDataException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class LeituraArquivos {

    public static void main(String[] args)throws IOException {

        Path arquivos = Paths.get("C:\\Users\\Ureal\\Desktop\\arquivo.txt");

        List<String> linhas = Files.readAllLines(arquivos);

        for(int i = 0 ; i<linhas.size();i++){

            String nome = linhas.get(i);

            System.out.print("tarefa "+i+" "+nome);

        }
    }
}
