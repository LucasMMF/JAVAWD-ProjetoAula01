// Identificação do pacote
package principal;

import java.io.PrintWriter;

import entities.Cliente;

// Definição da classe
public class Program {

	// Método padrão para execução do projeto/classe
	public static void main(String[] args) {

		// Imprimindo mensagem na console do eclipse...
		// syso -> CTRL + espaço -> atalho pro System.out.println no eclipse.
		System.out.println("\n *** CADASTRO DE CLIENTES *** \n");

		// Criando um objeto para a classe Cliente
		Cliente cliente = new Cliente();

		// Preenchendo os dados do cliente (set -> entrada)
		cliente.setIdCliente(1);
		cliente.setNome("Lucas Mateus");
		cliente.setTelefone("21 12345-6789");
		cliente.setEmail("mateusmidao@gmail.com");
		cliente.setCpf("123.456.789-00");

		// Gravando os dados do cliente em um arquivo
		try { // Tentativa

			// Abrindo um arquivo em modo de escrita
			PrintWriter printWriter = new PrintWriter("D:\\temp\\java\\webdeveloper\\cliente.txt");

			// Escrevendo no arquivo:
			printWriter.write("\nID DO CLIENTE...: " + cliente.getIdCliente());
			printWriter.write("\nNOME............: " + cliente.getNome());
			printWriter.write("\nTELEFONE........: " + cliente.getTelefone());
			printWriter.write("\nEMAIL...........: " + cliente.getEmail());
			printWriter.write("\nCPF.............: " + cliente.getCpf());

			printWriter.flush(); // Salvar as alterações do arquivo
			printWriter.close(); // Fechar o arquivo

			System.out.println("Dados do cliente cadastrados com sucesso!");

		} catch (Exception e) { // Captura o erro

			System.out.println("Erro ao cadastrar cliente.");
			e.printStackTrace(); // Imprimir o log (detalhamento) do erro

		}

	}

}
