/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Denilson
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //criar um file com um camhino especifico
        File file = new File("C:\\Users\\Denilson\\Documents\\MyFolders\\Learning Java\\ficheiro.txt");
        
        //try and catch
        //O Programa tenta executar o bloco do codigo try
        try{
            //executa a funcão de criar arquivo
            if(file.createNewFile()){
                System.out.println("Arquivo criado!");
            }else{
                System.out.println("Arquivo ja existe!");
            }  
        //Se algo de errado acontecer, Imprime a mansagem de erro
        //Evitando Evitando que o pragrama feche caso ocorrer algum erro. 
        }catch(IOException e){
            System.err.println("Algo deu errado!!");
        }
        
    }
    
}
