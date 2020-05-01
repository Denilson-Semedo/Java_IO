/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denilson
 */
public class path {
    public static void main(String [] args){
        
        String fileName = "arquivo.txt";//Declara o nome do arquivo
        String workingdir = System.getProperty("user.dir");//Guardar o caminho do diretório actual
        String absolute = "";
        
        //Captura o OS(Sistema Operativo)
        String meuOS = System.getProperty("os.name").toLowerCase();
        
        //verifica e cria diretórios de acordo com o OS
        if(meuOS.contains("win")){//Windows
            absolute = workingdir + "\\" + fileName;
        //Linux || Mac OS
        }else if(meuOS.contains("nix") || meuOS.contains("nux") || meuOS.contains("mac")){
            absolute = workingdir + "/" + fileName;
        }else{
            absolute = workingdir + "/" + fileName;
        }
        
        System.out.println("Caminho Final"+absolute);
        System.out.println(System.getProperty("os.name"));
        
        //Cria o ficheiro de acordo com o caminho gerado em cima
        File file = new File(absolute);
        
        //try and catch
        //O Programa tenta executar o bloco do codigo try
        try {
            if(file.createNewFile()){
                System.out.println("Arquivo criado");
            }else{
                System.out.println("Arquivo existente");
            }
        //Se algo de errado acontecer, Imprime a mansagem de erro
        //Evitando Evitando que o pragrama feche caso ocorrer algum erro. 
        } catch (IOException ex) {
            Logger.getLogger(path.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
