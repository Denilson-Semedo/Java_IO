/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

/**
 *
 * @author Denilson
 */
 
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Escrever {
  public static void main(String[] args) {
    //try and catch
    //O Programa tenta executar o bloco do codigo try
    try {
      FileWriter file = new FileWriter("arquivo.txt");//Instancia um objeto FileWrite e Indica o ficheiro onde ira escrever 
      file.write("Escrevendo no arquivo...");//Escreve no arquivo
      file.close();//Fecha o arquivo
      System.out.println("Sucesso ao escrever no arquivo");
      
      //Se algo de errado acontecer, Imprime a mansagem de erro
      //Evitando Evitando que o pragrama feche caso ocorrer algum erro. 
    } catch (IOException e) {
      System.err.println("Algo ocorreu mal!!");
      e.printStackTrace();
    }
  }
}
