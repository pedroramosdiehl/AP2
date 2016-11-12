/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package codigos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Pedro
 */
public class ManipuladorArquivo {
	
	public static void main(String[] args) {
		
	File arquivo = new File("C:/Users/Pedro/Dropbox/#UFG/AP2/Netbeans/Caixa/src/caixa/text.txt" );
	
	arquivo.delete();
 
	try {

		if (!arquivo.exists()) {
		//cria um arquivo (vazio)
			arquivo.createNewFile();
		}

		//caso seja um diretório, é possível listar seus arquivos e diretórios
		File[] arquivos = arquivo.listFiles();

		//escreve no arquivo
		FileWriter fw = new FileWriter(arquivo, true);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("3");

		bw.close();
		fw.close();

		//faz a leitura do arquivo
		FileReader fr = new FileReader(arquivo);

		BufferedReader br = new BufferedReader(fr);

		String linha = br.readLine();

		System.out.println(linha);

		br.close();
		fr.close();

	} catch (IOException ex) {
		ex.printStackTrace();
	}

	}
	
}
